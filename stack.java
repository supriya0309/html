public class stack{
static class node{
int value;
node next;
public node(int value)
{
this.value=value;
}
}
private node first=null;
public void push(node node){
node.next=first;
first=node;
}
public void pop(){
first=first.next;
}
public void print(){
node node=first;
while(node!=null){
system.out.print/n("\"+node.value+"\");
nnode=node.next;
}
}
public static void main(string[]args){
stack s=new stack();
s.push(new node(1));
s.push(new node(2));
s.push(new node(4));
s.push(new node(8));
s.print();
}
}
