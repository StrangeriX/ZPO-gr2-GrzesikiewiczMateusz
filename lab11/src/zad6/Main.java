package zad6;

public class Main {
    public static void main(String[] args) {
        Menu editor = new Menu("Totally new menu");

        Menu options = new Menu("Options");
        Menu edit = new Menu("Edit");
        Menu delete = new Menu("Delete");
        Menu exit = new Menu("Exit");

        editor.addTools(edit);
        editor.addTools(options);
        editor.addTools(delete);
        editor.addTools(exit);

        Tool saveAs = new Tool("Save As");
        Tool rename = new Tool("Rename");

        Tool undo = new Tool("Undo");
        Tool redo = new Tool("Redo");

        Tool deleteFile = new Tool("Delete File");
        Tool deleteProject = new Tool("Delete Project");

        Tool exitWithSave = new Tool("Save and exit");
        Tool exitWithoutSave = new Tool("Just exit");


        options.addTools(saveAs);
        options.addTools(rename);

        edit.addTools(undo);
        edit.addTools(redo);

        delete.addTools(deleteFile);
        delete.addTools(deleteProject);

        exit.addTools(exitWithSave);
        exit.addTools(exitWithoutSave);

        editor.print();
    }
}
