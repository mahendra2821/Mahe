
    class AI{
        String name="CSE-AI";
        void disply1(){
        System.out.println(name);
        }
        }
        class IOT extends AI {
        String name = "CSE-IOT";
        void disply(){
        System.out.println(name);
        System.out.println(super.name);
        }
        }
        class encapsule_d{
        public static void main(String args[]){
        IOT iot = new IOT();
        iot.disply();
        }
        
}
