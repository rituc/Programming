#include<iostream>
// #include<conio.h>

class stock{
  int id;
  float rate;
  int date;
  char name;
public:
  stock()
  {
    id=1001;rate=200;date=1;
  }
  ~stock()
  {
    std::cout<<"deconstructor called "<<std::endl;
  }
  void reg(int i,float r)
  {
    id=i;
    rate=r;
  }
  void change(int ne,int dt)
  {
    rate+=ne;
    date=dt;
  }
  void show(char obj)
  { 
    std::cout<<"name: "<<obj<<std::endl;
    std::cout<<"------------"<<std::endl;
    std::cout<<"id: "<<id<<std::endl;
    std::cout<<"date:"<<date<<std::endl;
    std::cout<<"rate: "<<rate<<std::endl;
    std::cout<<"*********************************************"<<std::endl;
  }
} ;
int main()
{
  stock a,b,c,d, e;
  a.show('a');
  a.reg(1024,150);
  a.show('a');
  a.change(-20,20);
  a.show('a');
  a.reg(1010,160);
  a.change(-20,20);
  a.show('a');
  b.reg(2015,300);
  b.change(100,29);
  c.change(-20,20);
  d.change(40,30);
  a.show('a');
  b.show('b');
  c.show('c');
  d.show('d');
}

