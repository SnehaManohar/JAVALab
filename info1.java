package journals;
public class info1 {
String journalname[]={"IEEE MAGAZINE","THE ATLANTIC","THE ECONOMICS TIMES"};
int journalid[]={1,2,3};
public void display(int ch)
{
if(ch==0)
{
System.out.println("journalid: "+journalid[0]+" journal name: "+journalname[0]);
}
if(ch==1)
{
System.out.println("journalid: "+journalid[1]+" journal name: "+journalname[1]);
}
if(ch==2)
{
System.out.println("journalid: "+journalid[2]+" journal name: "+journalname[2]);
}
}
}