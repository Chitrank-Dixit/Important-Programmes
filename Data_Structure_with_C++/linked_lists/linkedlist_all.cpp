#include<iostream>

using namespace std;

struct Node
{
	int data;
	Node *next;
};

struct HeadNode
{
	int count;
	Node *headPtr;
};

class LinkedList
{
	public:
		LinkedList();
		~LinkedList();

		void addToHead( int );
		bool removeFromHead();

//		bool addToTail( int );
//		bool removeFromTail();

		void addNode( int );
		bool deleteNode( int );
		void deleteAllNodes();

		bool isEmpty();
		int getNoOfNodes();

		void displayAllNodes();

	private:
		int dataCmp( int, int );
		void displayNode( Node* );

		HeadNode head;

};

LinkedList::LinkedList()
{
	head.count = 0;
	head.headPtr = NULL;
	return;
}

LinkedList::~LinkedList()
{
	deleteAllNodes();
	return;
}

void LinkedList::addToHead( int newData )
{
	Node *pNew = new Node;
	pNew -> data = newData;
	pNew -> next = head.headPtr;
	head.headPtr = pNew;
	head.count++;
}

bool LinkedList::removeFromHead()
{
	bool exit;
	Node *temp;

	if ( head.headPtr )
	{
		temp = head.headPtr;
		head.headPtr = head.headPtr -> next;
		delete temp;
		head.count--;
		exit = true; // returns true if successful
	}
	else
		exit = false; // returns false if unsuccessful

	return exit;
}

/*
bool LinkedList::addToTail( int )
{

}
bool LinkedList::removeFromTail()
{

}
*/

void LinkedList::addNode( int newData )
{
	Node *pNew = new Node,
	     *pPre = NULL,
	     *pCur = head.headPtr;
	pNew -> data = newData;

	while ( pCur && dataCmp( pNew -> data, pCur -> data ) >= 0 )
	{
		pPre = pCur;
		pCur = pCur -> next;
	}

	if ( pPre )
	{
		pNew -> next = pPre -> next;
		pPre -> next = pNew;
		head.count++;
	}
	else
	{
		pNew -> next = head.headPtr;
		head.headPtr = pNew;
		head.count++;
	}
	
}

bool LinkedList::deleteNode( int data )
{
	bool exit;
	Node *pPre = NULL,
	     *pCur = head.headPtr;

	while ( pCur && dataCmp( pCur -> data, data ) < 0 )
	{
		pPre = pCur;
		pCur = pCur -> next;
	}

	if ( pCur && dataCmp( pCur -> data, data ) == 0 )
	{
		if ( pPre )
		{
			pPre -> next = pCur -> next;
			delete pCur;
			head.count--;
			exit = true; // return true if successful
		}
		else
		{
			head.headPtr = pCur -> next;
			delete pCur;
			head.count--;
			exit = true; // return true if successful
		}
	}
	else
		exit = false; // return false if unsuccessful

	return exit;
}

void LinkedList::deleteAllNodes()
{
	Node *temp;

	while ( head.headPtr )
	{
		temp = head.headPtr;
		head.headPtr = head.headPtr -> next;
		delete temp;
		head.count--;
	}

	return;
}

bool LinkedList::isEmpty()
{
	return head.count == 0;
}


int LinkedList::getNoOfNodes()
{
	return head.count;
}

void LinkedList::displayAllNodes()
{
	Node *pCur = head.headPtr;
	int nodeCount = 1;

	while ( pCur )
	{
		cout << "Node " << nodeCount << ": ";
		displayNode( pCur );
		cout << endl;

		nodeCount++;
		pCur = pCur -> next;
	}

	return;
}


int LinkedList::dataCmp( int value0, int value1 )
{
	int exit = 0;

	if ( value0 < value1 )
		exit = -1;
	else if ( value0 > value1 )
		exit = 1;

	return exit;
}

void LinkedList::displayNode( Node *node )
{
	cout << node -> data;
	return;
}

void printMenu()
{
	cout << "1. Add to head" << endl;
	cout << "2. Remove from head" << endl;
	cout << "3. Add node " << endl;
	cout << "4. Delete node" << endl;
	cout << "5. Delete all nodes" << endl;
	cout << "6. Is the list empty?" << endl;
	cout << "7. Get number of nodes" << endl;
	cout << "8. Display all nodes" << endl;
	cout << "9. Quit" << endl;
}

int getChoice()
{
	int choice;

	cout << "Select choice: ";
	cin >> choice;
	cin.clear();
	cin.ignore( 200, '\n' );
	return choice;
}

int getData()
{
	int data;

	cout << "Enter data: ";
	cin >> data;
	cin.clear();
	cin.ignore( 200, '\n' );

	return data;
}

void processChoice( int choice, LinkedList& list )
{
	int data;
	//bool opStatus;

	switch ( choice )
	{
		case 1: data = getData();
			list.addToHead( data );
			break;
		case 2: if ( list.removeFromHead() )
			{
				cout << "Removed node from head" << endl;
			}
			else
				cerr << "List is empty" << endl;
			break;
		case 3: data = getData();
			list.addNode( data );
			cout << "Node " << data
			     << " added";
			cout << endl;
			break;
		case 4: if ( !list.isEmpty() )
			{
				data = getData();
				if ( list.deleteNode( data ) )
				{
					cout << "Node " << data
					     << " deleted";
					cout << endl;
				}
				else
					cerr << "Node not found" << endl;
			}
			else
				cerr << "List is empty" << endl;
			break;
		case 5: list.deleteAllNodes();
			cout << "All nodes deleted" << endl;
			break;
		case 6: cout << ( list.isEmpty() ? 
			          "List is empty" : "List is not empty" );
			cout << endl;
			break;
		case 7: cout << "No. of nodes: "
			     << list.getNoOfNodes();
			cout << endl;
			break;
		case 8: list.displayAllNodes();
			break;
		default: cout << "Invalid choice" << endl;
	}

}

int main()
{
	LinkedList list;
	int choice;
	do
	{
		printMenu();
		choice = getChoice();

		if ( choice != 9 )
			processChoice( choice, list );

	} while ( choice != 9 );
	


	return 0;
}
