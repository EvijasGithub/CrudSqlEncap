public class Main {
    public static void main(String[] args) {
        Crud crud=new Crud();
        //Setting values of the variables
        crud.setCR("jdbc:mysql://localhost:3306/crudandencap");
        crud.setUSER("root");
        crud.setPASSWORD("Ferret345!");

        //Displaying values of the variables
        System.out.println(crud.getCR());
        System.out.println(crud.getUSER());
        System.out.println(crud.getPASSWORD());


        crud.insert();
        crud.select();
        crud.delete();
        crud.update();


    }
}
