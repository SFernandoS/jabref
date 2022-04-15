package org.jabref.logic.xmp;

public class XmpChange {
    public static boolean isPdf(String path) {
        return path.endsWith(".pdf");
    }

    public static String ChangeMetadata(int code, XmpMeta pdfMeta, String newAuthor,
                                        String newTitle,String newSubject,String newDate){
        switch(code) {
            case 1:
                pdfMeta.setAuthor(newAuthor);
                return pdfMeta.getAuthor();
            case 2:
                pdfMeta.setTitle(newTitle);
                return pdfMeta.getTitle();
            case 3:
                pdfMeta.setSubject(newSubject);
                return pdfMeta.getSubject();
            case 4:
                pdfMeta.setDate(newDate);
                return pdfMeta.getDate();
            default:
                return "Nao encontrado";
        }
    }
}
