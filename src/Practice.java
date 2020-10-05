public class Practice {
    public static void main(String[] args) {
        System.out.println(digging("shovel"));
        System.out.println(digging("spoon"));
        System.out.println(digging());
    }
    public static String digging(String tool){
        if(tool.equals("shovel")){
            return "We found treasure!";
        }else if(tool.equals("spoon")){
            System.out.println("Are you sure?");
            return digging("shovel");
        }else{
            return "These are not the right tools";
        }

    }

    public static String digging(){
        return "not tools";
    }
}
