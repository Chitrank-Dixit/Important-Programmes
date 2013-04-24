# Spanning Tree (Twice Around a Tree Approach to Travelling Salesman Problem)
# Join two Spanning Trees

# This is a different approach and might take more time to find the optimal tour

# this is a Sage program because the Graph is plotted here using Sage.

# Author : Chitrank Dixit

from sage.all import *

import get_ST
import random
import cPickle

def make_weighted_links(W,node1,node2):
    weights=cPickle.load(open("costs.p","rb"))
    cost=0
    for lists in weights:
        if lists[0]==(node1,node2):
            cost=lists[1]
    W.append((node1,node2,cost))

#def make_graph_linking(created_graph):
    


def make_link(W,G,node1,node2):
    weight=random.randrange(1,50)
    if node1 not in G:
        G[node1]={}
    (G[node1])[node2]=weight
    if node2 not in G:
        G[node2]={}
    (G[node2])[node1]=weight
    W.append([(node1,node2),weight])
    return G,W

def make_link_with_cost(Gr,n1,n2,cost):
    if n1 not in Gr:
        Gr[n1]={}
    (Gr[n1])[n2]=cost
    if n2 not in Gr:
        Gr[n2]={}
    (Gr[n2])[n1]=cost
    return Gr


def create_graph(connections):
    G={};Weight=[]
    for node1,node2 in connections:
        make_link(Weight,G,node1,node2)
    return G,Weight

'''    
created_graph=create_graph([('a','b'),('a','e'),('a','c'),('a','d'),('b','c'),('b','d'),('b','e'),('c','d'),		('c','e'),('d','e')])

print created_graph

p=Graph(created_graph)
p.show()
g=Graph([('a','b'),('a','e'),('a','c'),('a','d'),('b','c'),('b','d'),('b','e'),('c','d'),('c','e'),('d','e')])
g.show()
'''

def recreate(connections,node1,node2):
    
	#new_graph=remove_link(connections,node1,node2)
	#print new_graph
	for node in connections:
    
		keylist=connections[node].keys()
		if node1 in keylist:
			del (connections[node])[node1]
		if node2 in keylist:
			del (connections[node])[node2]
	return connections

def re_assign(to_reassign):
    for key in to_reassign:
        key[0]=key[0]+"'"
        key[1]=key[1]+"'"
    return to_reassign

def assign_weights(key1,key2):
    cost=0
    weights=cPickle.load(open("Complete_Graph.p","rb"))
    
    return weights[key1][key2]
    


def recreate_path(path):
    i=1;j=0
    while i<len(path):
        if path[i][:-1]==path[j]:
            path.remove(path[i])
        elif path[j][:-1]==path[i]:
            path.remove(path[j])
        i=i+1
        j=j+1
    i=0
    
    while i < len(path):
        if "'" in path[i]:
            path[i]=path[i][:-1]
            
        i=i+1
            
    return path

def split_formation(path,st,end,mid_val,length):
    temp=[];result=[];result1=[]
    mid=int(round(len(path)/2.0))
    print mid
    rev=[]
    print path[mid-1]
    for i in range(0,mid-1):
        for j in range(mid,len(path)):
            if path[i]!=path[j]:
                temp.append(path[j])
            j=j+1
        print temp
        result.append([st,path[i],mid_val])
        for key in temp:
            result[i].append(key)
        result[i].append(end)
        # still to find half of the tours per case
        
        result1.append([st,path[i],mid_val])
        rev=temp[::-1]
        for key in rev:
            result1[i].append(key)
        result1[i].append(end)
        
        #result.append([st,path[i],mid_val])
        
        #print result1
        
        temp=[];
        i=i+1
        
    print result,result1
    return result,result1
        
        
    
    
    

        

def two_optvariant(path,length,nftours):
    '''
        This 2 opt variant is designed to improve our solution using split and merge
        technique in the native 2 opt technique

    '''
    
    st=path[0];ed=path[-1];tours=[]
    mid=int(round(len(path)/2.0))
    back_shift=mid-1;for_shift=mid-1
    for i in range(0,length-1):
        mid_val=path[mid-1]
        print st,mid_val,ed
        path=path[1:-1]
        #path.removGood Evenine(mid_val)
        print path                        # program is correct upto this step
        tour1,tour2=split_formation(path,st,ed,mid_val,length)
        for key in tour1:
            tours.append(key)
        for key2 in tour2:
            tours.append(key2)
        path=cPickle.load(open("path.p","rb"))
        print "Pickled path",path
        if back_shift>0:
            temp=path[mid-1];temp1=path[back_shift-1];temp2=path[back_shift+1]
            print temp,temp1,temp2
            path[back_shift-1]=path[mid-1]
            path[for_shift+1]=path[mid-1]
            path[mid-1]=temp1
            back_shift=back_shift-1
            for_shift=for_shift+1
        print path
    cPickle.dump(tours,open("feasible_tours.p","wb"))    
    return tours
        
        
    
'''
def check_subtour(edge,gen_MST):
    for ed in gen_MST:
        if (ed[0],ed[1]) and (edge[0],ed[1]) in gen_MST:
            if (ed[0],edge[0]) in gen_MST:
                return True
    return False
'''

'''	
def minimum_spanning(W,length,vertex_list):
    N=W;cost=0;no1=[];no2=[]
    gen_MST=[]
    i=0
    
    tra_list=sorted(W,key=sortfrback)
    print tra_list
    gen_MST.append(tra_list[0][0])
    covered=set((tra_list[0][0][0],tra_list[0][0][1]))
    print covered
    x=set()
    for edge,weight in tra_list:
        x.add(edge)
    print x    
        
    
    
    
    for edge,weight in tra_list:
                   
        pre_st,po_st=edge[0],edge[1]
        print pre_st
        if (pre_st,po_st) not in covered:
            gen_MST.append(edge)
            covered.add(edge)
                 
            
                
            
                
                
            #if (st,edge[1]) or (pre_st,edge[1]) or (po_st,edge[1]) in gen_MST):
            #    pass
            #else:
                
            
        
        cost=cost+weight
        i=i+1
    #c=[gen_MST[0]]
               
    print cost,gen_MST
    print covered       
    return gen_MST
'''   
def no_of_tours(length):
    '''
        This procedure is used to find the number of possible tours
        as there are n vertices there should be (n-1)! fesible tours possible
    
    '''
    length=length-1
    i=1;f=1
    while i<=length:
        f=f*i
        i=i+1
    return f
        
def make_path(key):
    '''
        Ultimately make link between the two vertices (the path we obtained all feasible tours)
        and assign them the cost


    '''

    
    link=[];i=0;j=i+1;tcost=0
    while i < len(key):
        if j==len(key):
            break
        cost=assign_weights(key[i],key[j])
        tcost=tcost+cost
        link.append((key[i],key[j],cost))
        i=i+1
        j=j+1
    link.append(tcost)
    print link
    return link

def sortfrback(l):
    '''
        This method is used to sort the tour with minimum weight
        This method would return the last element of the list

        As our designed graph with its cost the last element would be the total
        cost of the journey from the source to the destination

        e.g.
        [('a', 'c', 21), ('c', 'b', 19), ('b', 'd', 24), ('d', 'e', 33), ('e', 'a', 38), 135]
        

    '''
    return l[-1]
   
            
def euler_path(created_graph,st):
    tot_cost=0;join=[]
    ng={}
    key=created_graph.keys();length=len(key)
    ng=cPickle.load(open("Complete_Graph.p","rb"))
    #costs=cPickle.dump(ng[st],open("key_clipped.p","wb"))
    span_tree,cost=get_ST.minimum_spanning(ng,st)
    #sent graph to the minimum_spanning (ng =graph and st= starting point)
    #elem=first_tsp[len(first_tsp)-1][0]
    #costs=cPickle.load(open("key_clipped.p","rb"))
    tot_cost=tot_cost+cost
    print "Minimum Cost is:",tot_cost,span_tree
    start_edge=span_tree[0][0];end_edge=span_tree[-1][1]
    cPickle.dump(span_tree,open("spanning_tree.p","wb"))
    dspan_tree=cPickle.load(open("spanning_tree.p","rb"))
    rdspan_tree=re_assign(dspan_tree)
    print "rdspan",rdspan_tree
    rdspan_tree=rdspan_tree[::-1]
    for edge in rdspan_tree:
        temp=edge[0]
        edge[0]=edge[1]
        edge[1]=temp
    span_tree.append([end_edge,rdspan_tree[0][0],0])
    print rdspan_tree
    for key in rdspan_tree:
        span_tree.append(key)
    span_tree.append([span_tree[-1][1],start_edge,0])
    #span_tree.append([span_tree[0][0],rdspan_tree[0][0],0])
    #span_tree.append([dspan_tree[-1][1],end,0])
    cPickle.dump(span_tree,open("Euler.p","wb"))
    print span_tree
    path=[]
    path.append(span_tree[0][0])
    for key in span_tree:
        path.append(key[1])
    print "path",path
    nftours=no_of_tours(length)
    new_path=recreate_path(path)
    print nftours,new_path
    cPickle.dump(new_path,open("path.p","wb"))
    if len(new_path)>3:
        tours=two_optvariant(new_path,length,nftours)
        print tours
        tour_links=[];cost=0
        for key in tours:
            tour_links.append(make_path(key))
        cPickle.dump(sorted(tour_links , key=sortfrback),open("tours_sorted.p","wb"))
        optimal_tour=cPickle.load(open("tours_sorted.p","rb"))
        print optimal_tour
        print optimal_tour[1]
        N=Graph(optimal_tour[1][:-1])
        N.weighted(True)
        P1=N.plot(edge_labels=True,graph_border=True,edge_style="dotted")
        P1.save("Graph.png")
                
            #weighted_tours=assign_weights(tours)
            #cPickle.dump(tours,open("feasible_tours.p","wb"))    
            
    else:
        print "Optimal Tour"
        
        #first_tsp[-1].append(costs[elem])
	#ng=cPickle.load(open("Complete_Graph.p","rb"))
	
	
    
   
def main(st):
    print "A Complete Graph "
    #g=Graph([('a','b'),('a','e'),('a','c'),('a','d'),('b','c'),('b','d'),('b','e'),('c','d'),('c','e'),('d','e')])
    #g.show()
    #created_graph,Weights=create_graph([('a','b'),('a','e'),('a','c'),('a','d'),('b','c'),('b','d'),('b','e'),('c','d'),('c','e'),('d','e')])
    			
    
    
    created_graph={'Indore': {'Dubai': 2105.02, 'Mumbai': 514.99, 'Berlin': 6175.05, 'NY': 12306.65}, 
	'Dubai': {'Indore': 2105.02, 'Mumbai': 1936.04, 'Berlin': 4622.04, 'NY': 11007.91}, 
	'Mumbai': {'Indore': 514.99, 'Dubai': 1936.04, 'Berlin': 6292.54, 'NY': 12546.45},
	 'Berlin': {'Indore': 6175.05, 'Dubai': 4622.04, 'Mumbai': 6292.54, 'NY': 6387.49},
	  'NY': {'Indore': 12306.65, 'Dubai': 11007.91, 'Mumbai': 12546.45, 'Berlin': 6387.49}}
    connections=[]
    for key in created_graph:
        for key1 in created_graph[key]:
            if (key,key1) not in connections:
                connections.append([(key,key1),created_graph[key][key1]])
    print connections
    
    cPickle.dump(connections,open("connections.p","wb"))
    cPickle.dump(created_graph,open("Complete_Graph.p","wb"))
    euler_path(created_graph,st)
    
    '''
	{'a': {'c': 0, 'b': 10, 'e': 31, 'd': 47}, 
	'c': {'a': 0, 'b': 8, 'e': 14, 'd': 36}, 
	'b': {'a': 10, 'c': 8, 'e': 3, 'd': 23},
	 'e': {'a': 31, 'c': 14, 'b': 3, 'd': 27},
	  'd': {'a': 47, 'c': 36, 'b': 23, 'e': 27}}

    '''
    #print recreate(created_graph,'a','d')
    print "________________________________________________________________________"
    print "\n Spanning Tree is "
    
    '''
    G=Graph(created_graph)
    G.weighted(True)
    E = kruskal(G, check=True)
    print E
    tot=[]
    kcost=0;totcost=0
    for key in E:
        tot.append((key[0],key[1]))
        kcost=kcost+key[2]
        
    print tot
    tot1=[]    
    for key in E:
        tot1.append((key[0],key[1]))
        tot1.append((key[0],key[1]))
        kcost=kcost+2*key[2]
    print tot1
    '''
    '''
        TOTG={}                      # empty graph for the Connections
        for k in E:
            TOTG=make_link_with_cost(TOTG,key[0],key[1],key[2])
            
        print TOTG
    '''
    '''
    totcost=float(kcost)/2.0
    print tot,totcost,kcost
    N=Graph(E)
    P1=N.plot()
    P1.save("G1.png")
    N1=Graph(tot)
    P2=N1.plot()
    P2.save("G2.png")
    '''    
    
#print main('Indore')
		
							


    
