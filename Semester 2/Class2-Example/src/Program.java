
    class ListItem {
        private ListItem  next;
        private Object  info;
        public ListItem(Object info,ListItem next){
            this.info = info;
            this.next =  next;
        }
        public Object getElm(){return info;}
    }
    class List {
        private ListItem   head ;
        public List() { head =  null;}
        public void addItem(Object info) {
            head = new ListItem(info , head);
        }
        public Object firstElm(){return head.getElm();}
    }
    class Point{
        int x,y;
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public class Program {
        public static void main(String[] args){
            List  l1 = new List();
            List  l2 = new List();
            l1.addItem(new Point(1,2));
            l1.addItem(new Point(5,7));
            l1.addItem(new Point(3,1));
            Point p = (Point)l1.firstElm();
        }
	

//		Car c=new Car("Subaro B4", "Bluu", 4, 240, "12-345-67");
//		c.changeSpeed(120, 90);
//		c.changeSpeed(60, 90);
//		c.show();
//
//		System.out.println("\nthe truck\n");
//		Truck t = new Truck("12345", 80, 5, 1000, 5);
//		t.show();
//
//		Vehicle[] vehicles = new Vehicle[]{c,t};
//
//		for (int i = 0; i < vehicles.length ; i++) {
//			vehicles[i].show();
//		}
//		RaceCar r=new RaceCar(220, "some race car", "Orange", 320, "98-765-43");
//		r.changeSpeed(200);
//		r.show();
//		r.changeSpeed(222);
//		r.show();
//



	}

