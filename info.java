package books;
public class info {
int bookid[]={01,02,03,04,05};
int accessno[]={11,22,33,44,55};
String author[]={"JK ROWLING","NICHOLAS SPARKS","PAULO COELHO","CHARLES DICKENS","JAMES JOYCE"};
String bookname[]={"HARRY POTTER","THE NOTEBOOK","THE ALCHEMIST","DAVID COPPERFIELD","ULYSSES"};
String publication[]={"BLOOMSBURY","GRAND CENTRAL","HARPER COLLINS","BRADBURY","SYLVIA BEACH"};
public void display(int ch)
{
if(ch==0)
{
System.out.println("bookid: "+bookid[0]+" accessno: "+accessno[0]+" author:"+author[0]+" bookname: "+bookname[0]+" publication: "+publication[0]);
}
if(ch==1)
{System.out.println("bookid: "+bookid[1]+" accessno: "+accessno[1]+" author:"+author[1]+" bookname: "+bookname[1]+" publication: "+publication[1]);
}
if(ch==2)
{
System.out.println("bookid: "+bookid[2]+" accessno: "+accessno[2]+" author:"+author[2]+" bookname: "+bookname[2]+" publication: "+publication[2]);
}
if(ch==3)
{
System.out.println("bookid: "+bookid[3]+" accessno: "+accessno[3]+" author:"+author[3]+" bookname: "+bookname[3]+" publication: "+publication[3]);
}
if(ch==4)
{
System.out.println("bookid: "+bookid[4]+" accessno: "+accessno[4]+" author:"+author[4]+" bookname: "+bookname[4]+" publication: "+publication[4]);
}
if(ch==5)
{
System.out.println("bookid: "+bookid[5]+" accessno: "+accessno[5]+" author:"+author[5]+" bookname: "+bookname[5]+" publication: "+publication[5]);
}
}
}