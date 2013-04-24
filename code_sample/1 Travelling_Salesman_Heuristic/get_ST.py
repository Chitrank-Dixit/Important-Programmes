


def recreate(connections,node1,node2):
	'''
	recreate will take as an argument a Graph and two nodes of the graph and disconnect them
	'''
	#new_graph=remove_link(connections,node1,node2)
	#print new_graph
	for node in connections:
		keylist=connections[node].keys()
		if node1 in keylist:
			del (connections[node])[node1]
		if node2 in keylist:
			del (connections[node])[node2]
	return connections

def minimum_spanning(Graph,start):
	'''
	Gives the Minimum Spanning Tree , cost generated
	'''
	G=Graph.copy()
	list_gen=[];list_weight=[];minimum=[];current_vertex=[];i=0
	out_keylist=G.keys();update_point=start;cost=0
	while i<len(G):
		indexed=out_keylist.index(update_point)  # index of the key (position we started from)
		min_vertex=min(G[out_keylist[indexed]].values())
		print min_vertex
		cost=cost+min_vertex
		node1=G[out_keylist[indexed]].keys()[G[out_keylist[indexed]].values().index(min_vertex)]
		list_gen.append([out_keylist[indexed],node1,min_vertex])
		G=recreate(G,node1,out_keylist[indexed])
		out_keylist.remove(update_point)
		
		update_point=node1  # update the next position to move from 
		
		if len(out_keylist)==1:
			break
		i=i+1
	#list_gen.append([out_keylist.pop(),start])
	return list_gen,cost
