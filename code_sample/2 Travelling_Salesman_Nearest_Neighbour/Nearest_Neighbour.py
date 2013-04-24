# minimum Spanning tree
from sage.all import *
import cPickle #as pickle 
import get_MST
import random

def make_link(G,node1,node2):
	weight=random.randrange(1,50)
	if node1 not in G:
		G[node1]={}
	(G[node1])[node2]=weight
	if node2 not in G:
		G[node2]={}
	(G[node2])[node1]=weight
	return G

'''
This remove link will be of no use as it removes the nodes and all its connections
def remove_link(G,node1,node2):
	if node1 in G:
		del G[node1]
	if node2 in G:
		del G[node2]
	
	return G
	
'''


def create_graph(connections):
	G={}
	for node1,node2 in connections:
		make_link(G,node1,node2)
	
	
	return G
'''
def recreate(connections):
	
	recreate will take as an argument a Graph and two nodes of the graph and disconnect them
	
	#new_graph=remove_link(connections,node1,node2)
	#print new_graph
	for node in connections:
		keylist=connections[node].keys()
		to_add=list(connections[node].items())
		for items in to_add:
			
		if node1 not in keylist:
			connections[node]
			del (connections[node])[node1]
		if node2 in keylist:
			del (connections[node])[node2]
	return connections	
'''
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
'''
'''	
def minimum_spanning(G,start):
	list_gen=[];list_weight=[];minimum=[];current_vertex=[];i=0
	out_keylist=G.keys();update_point=start;cost=0
	while i<len(G):
		indexed=out_keylist.index(update_point)
		min_vertex=min(G[out_keylist[indexed]].values())
		cost=cost+min_vertex
		node1=G[out_keylist[indexed]].keys()[G[out_keylist[indexed]].values().index(min_vertex)]
		list_gen.append((out_keylist[indexed],node1))
			
		G=recreate(G,node1,out_keylist[indexed])
		out_keylist.remove(update_point)
		update_point=node1
		
		if len(out_keylist)==1:
			break
		i=i+1
	list_gen.append((out_keylist.pop(),start))
	del G
	print cost
	return list_gen
'''
def feasible_tours(created_graph,st):
	ng={}
	key=created_graph.keys()
	ng=cPickle.load(open("Complete_Graph.p","rb"))
	costs=cPickle.dump(ng[st],open("key_clipped.p","wb"))
	first_tsp,cost=get_MST.minimum_spanning(ng,st)
	elem=first_tsp[len(first_tsp)-1][0]
	costs=cPickle.load(open("key_clipped.p","rb"))
	cost=cost+costs[elem]
	print "Minimum Cost is:",cost
	first_tsp[-1].append(costs[elem])
	ng=cPickle.load(open("Complete_Graph.p","rb"))
	print first_tsp
	G=Graph(first_tsp)
	G.weighted(True)
	p=G.plot(edge_labels=True,graph_border=True,edge_style="dotted")
	p.save('Graph.png')
	
		



def main(city_list):
		
        to_create=[]
        st=city_list[0]
        for key in city_list:
                i=0
                while i<len(city_list):
                        if city_list[i]!=key:
                                to_create.append((key,city_list[i]))
                        i=i+1
        print to_create
        created_graph=create_graph(to_create)
        print created_graph
        G=Graph(created_graph)
        G.weighted(True)
        N=G.plot()
        N.save("abc.png")
        cPickle.dump(created_graph,open("Complete_Graph.p","wb"));
        feasible_tours(created_graph,st)
		
	

#print main(['a','b','c','d','e'])							


	
	
    

	
