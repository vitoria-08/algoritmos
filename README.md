#include<stdio.h>
  int main()
  
  {
  
  float imp,classi,fipro,aumento,sal;
  int x,resp;
  do
{

  printf("Escolha uma das opcoes a baixo:");
  printf("\n 1 - Imposto");
  printf("\n 2 - Novo Salario");
  printf("\n 3 - Classificacao");
  printf("\n 4 - Finalizar programa");
  
  scanf("%d%*c",&x);

  switch(x)

  {

  case 1:
  
printf("\nDigite o valor do salario:  ");
  
  scanf("%f%*c",&sal);
  
  if(sal<500)

  {

  imp = sal*5/100;printf

("\nValor do imposto:  
%f",imp);

}

if(sal>=500&&sal<=850)

{

imp = sal*10/100;

printf("\nValor do imposto:  %f",imp);

}

if(sal>850)

{

imp = sal*15/100;

printf("\nValor do imposto:  %f",imp);

}

printf("\nDigite 1 para reiniciar e 2 para sair\n");

scanf("%d%*c",&resp);

break;

case 2:

printf("\nDigite o valor do salario:  ");

scanf("%f%* c",&sal);

if(sal>1500)

{

aumento=sal+25;
printf("\nNovo salario: 
%f",aumento);

}

if(sal>=750&&sal<=1500)

{

aumento=sal+50;
printf("\nNovo salario:
%f",aumento);

}

if(sal>=450&&sal<750)

{

aumento=sal+75;
printf("\nNovo salario:   
%f",aumento);

}

if(sal<450)

{

aumento=sal+100;

printf("\nNovo salario:
%f",aumento);

{

printf("\nDigite 1 para reiniciar e 2 para sair\n");

scanf("%d%*c",&resp);

break;

case 3:

printf("\nDigite o salario do funcionario:  ");

scanf("%f%*c",&sal);

if(sal<=700)

{

printf("\nMal remunerado !" );

}

else

{

printf("\nBem remunerado !");

}

printf("\nDigite 1 para reiniciar e 2 para sair\n");

scanf("%d%*c",&resp);

break;

case 4:

printf("\nPrograma ENCERRADO");

break;

default:

printf("\nOpcao invalida !! ");

}

}

while(resp==1);

getchar();

return 0;


  }
