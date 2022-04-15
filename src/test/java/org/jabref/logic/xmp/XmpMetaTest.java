package org.jabref.logic.xmp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class XmpMetaTest {
//        private String pathPdf = new String("src/test/resources/pdfs/example.pdf");
//        private String pathNotPdf = new String("src/test/resources/pdfs/minimal-text.txt");
//    @Test
//    void testIsPDF() {
//        assertEquals(true, XmpDelete.isPdf(pathPdf));
//    }
//
//    @Test
//    void testNotIsPDF() {
//        assertEquals(false, XmpDelete.isPdf(pathNotPdf));
//    }
//
//    @Test
//    void testNotIsPathForPDF() {
//        assertEquals(false, XmpDelete.isPdf("not-exist"));
//    }

    @Test
    void testChangeMetadataAuthor() {
        XmpMeta newMetadata = new XmpMeta("O apanhador no Campo de Centeio",
                "J.D Salling", "Romance", "16:41");

        String result = XmpChange.ChangeMetadata(1, newMetadata,"Novo Autor",
                "Novo Titulo","Novo Assunto","Nova Data");

        assertEquals("Novo Autor", result);
    }

    @Test
    void testChangeMetadataTitle() {
        XmpMeta newMetadata = new XmpMeta("O apanhador no Campo de Centeio",
                "J.D Salling", "Romance", "16:41");

        String result = XmpChange.ChangeMetadata(2, newMetadata,"Novo Autor",
                "Novo Titulo","Novo Assunto","Nova Data");

        assertEquals("Novo Titulo", result);
    }

    @Test
    void testChangeMetadataAll() {
        XmpMeta newMetadata = new XmpMeta("O apanhador no Campo de Centeio",
                "J.D Salling", "Romance", "16:41");

        assertEquals("Novo Autor", XmpChange.ChangeMetadata(1, newMetadata,"Novo Autor",
                "Novo Titulo","Novo Assunto","Nova Data"));
        assertEquals("Novo Titulo", XmpChange.ChangeMetadata(2, newMetadata,"Novo Autor",
                "Novo Titulo","Novo Assunto","Nova Data"));
        assertEquals("Novo Assunto", XmpChange.ChangeMetadata(3, newMetadata,"Novo Autor",
                "Novo Titulo","Novo Assunto","Nova Data"));
        assertEquals("Nova Data", XmpChange.ChangeMetadata(4, newMetadata,"Novo Autor",
                "Novo Titulo","Novo Assunto","Nova Data"));
    }

    @Test
    void testChangeMetadataWrongCode() {
        XmpMeta newMetadata = new XmpMeta("O apanhador no Campo de Centeio",
                "J.D Salling", "Romance", "16:41");

        String result = XmpChange.ChangeMetadata(6, newMetadata,"Novo Autor",
                "Novo Titulo","Novo Assunto","Nova Data");

        assertEquals("Nao encontrado", result);
    }

    @Test
    void testDeleteMetadata() {
        XmpMeta newMetadata = new XmpMeta("O apanhador no Campo de Centeio",
                "J.D Salling", "Romance", "16:41");

        assertEquals(null, XmpChange.ChangeMetadata(1, newMetadata,null,
                "Novo Titulo","Novo Assunto","Nova Data"));
    }
}
