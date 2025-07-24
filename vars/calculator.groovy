def add(x,y){
  echo "The summation of ${x} and ${y} is ${x+y}"
}

def mul(Map config = [:]){
  echo "The multiplication of ${config.x} and ${config.y} is ${config.x*config.y}"
}
