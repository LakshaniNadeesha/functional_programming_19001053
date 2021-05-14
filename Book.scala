object Book extends App{
val coverprice = 24.95
val discount = 0.4
val realprice = 14.97

def price(x:Double)=
if(x<50){
println(((coverprice-(coverprice*discount))*x)+3);
}
else{
println(((realprice*50)+3)+((realprice*(x-50))+(0.75*(x-50))));
}

price(60);

}