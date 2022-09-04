package keywords.superkwd;

import oops.inheritance.Grandfather;

    public class Father extends Grandfather {
        int height = 9;
        public Father() {
        }
        public Father(int height){
            this.height = height;
            System.out.println(height);
        }
        public void education(){
            System.out.println("high school diploma");
        }
    }
//super keyword is associated with inheritance
//related to superclass

