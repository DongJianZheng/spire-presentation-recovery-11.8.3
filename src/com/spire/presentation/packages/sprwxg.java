/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravg;
import com.spire.presentation.packages.sprazg;
import com.spire.presentation.packages.sprczl;
import com.spire.presentation.packages.sprebh;
import com.spire.presentation.packages.sprftg;
import com.spire.presentation.packages.spriyg;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprnwg;
import com.spire.presentation.packages.sprpqg;
import com.spire.presentation.packages.sprpzg;
import com.spire.presentation.packages.sprqrg;
import com.spire.presentation.packages.sprrbh;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprrtea;
import com.spire.presentation.packages.sprryg;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprssg;
import com.spire.presentation.packages.sprsxg;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtvg;
import com.spire.presentation.packages.sprusc;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprwsg;
import com.spire.presentation.packages.sprwvg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Security;
import java.util.Iterator;

public class sprwxg {
    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        if (arg0[0].equals(sprrtea.cfr_renamed_9("d^"))) {
            if (arg0[1].equals(sprusc.cfr_renamed_9(" \u000e"))) {
                FileInputStream fileInputStream = new FileInputStream(arg0[3]);
                FileOutputStream fileOutputStream = new FileOutputStream(new StringBuilder().insert(0, arg0[2]).append(sprrtea.cfr_renamed_9("gL:N")).toString());
                sprwxg.cfr_renamed_8056(arg0[2], fileInputStream, fileOutputStream, arg0[4].toCharArray(), true);
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(arg0[2]);
            FileOutputStream fileOutputStream = new FileOutputStream(new StringBuilder().insert(0, arg0[1]).append(sprusc.cfr_renamed_9("#\r}\b")).toString());
            sprwxg.cfr_renamed_8056(arg0[1], fileInputStream, fileOutputStream, arg0[3].toCharArray(), false);
            return;
        }
        if (arg0[0].equals(sprrtea.cfr_renamed_9("d["))) {
            FileInputStream fileInputStream = new FileInputStream(arg0[1]);
            FileInputStream fileInputStream2 = new FileInputStream(arg0[2]);
            sprwxg.cfr_renamed_8057(fileInputStream, fileInputStream2);
            return;
        }
        System.err.println(sprusc.cfr_renamed_9("\u001a~\u000ej\n7O^\u0006j\u0001h\u000bK\u0006a\n]\u001db\fh\u001c~\u0000\u007fO \u0019qB~OVBl2-\td\u0003hOf\nt\td\u0003hOV\u001fl\u001c~?e\u001dl\u001ch2"));
    }

    private static /* synthetic */ void cfr_renamed_8056(String arg0, InputStream arg1, OutputStream arg2, char[] arg3, boolean arg4) throws IOException, sprtqg {
        int n;
        FileInputStream fileInputStream;
        Object object;
        spriyg spriyg2;
        if (arg4) {
            arg2 = new sprczl(arg2);
        }
        spriyg spriyg3 = spriyg2 = sprazg.cfr_renamed_8058(arg1);
        sprmah sprmah2 = spriyg3.cfr_renamed_7744(new sprqrg().cfr_renamed_1499("BC").cfr_renamed_1480(arg3));
        sprssg sprssg2 = new sprssg(new sprebh(spriyg2.cfr_renamed_1157().cfr_renamed_593(), 2).cfr_renamed_1499("BC"));
        sprssg2.cfr_renamed_7538(0, sprmah2);
        Iterator<String> iterator = spriyg3.cfr_renamed_1157().cfr_renamed_7712();
        if (iterator.hasNext()) {
            object = new sprsxg();
            ((sprsxg)object).cfr_renamed_7641(false, iterator.next());
            sprssg2.cfr_renamed_7666(((sprsxg)object).cfr_renamed_31());
        }
        object = new sprnwg(2);
        sprjah sprjah2 = new sprjah(((sprnwg)object).cfr_renamed_4137(arg2));
        sprssg2.cfr_renamed_7542(false).cfr_renamed_2623(sprjah2);
        File file = new File(arg0);
        sprrbh sprrbh2 = new sprrbh();
        OutputStream outputStream = sprrbh2.cfr_renamed_7552(sprjah2, 'b', file);
        FileInputStream fileInputStream2 = fileInputStream = new FileInputStream(file);
        while ((n = fileInputStream2.read()) >= 0) {
            fileInputStream2 = fileInputStream;
            int n2 = n;
            outputStream.write(n2);
            sprssg2.cfr_renamed_1221((byte)n2);
        }
        sprrbh2.cfr_renamed_2637();
        sprssg2.cfr_renamed_31().cfr_renamed_2623(sprjah2);
        ((sprnwg)object).cfr_renamed_2637();
        if (arg4) {
            arg2.close();
        }
    }

    private static /* synthetic */ void cfr_renamed_8057(InputStream arg0, InputStream arg1) throws Exception {
        int n;
        arg0 = sprmxg.cfr_renamed_7556(arg0);
        sprwvg sprwvg2 = new sprwvg(arg0);
        sprftg sprftg2 = (sprftg)sprwvg2.cfr_renamed_7703();
        sprwvg2 = new sprwvg(sprftg2.cfr_renamed_7830());
        sprpqg sprpqg2 = ((sprwsg)sprwvg2.cfr_renamed_7703()).cfr_renamed_576(0);
        sprpzg sprpzg2 = (sprpzg)sprwvg2.cfr_renamed_7703();
        InputStream inputStream = sprpzg2.cfr_renamed_2920();
        sprvbh sprvbh2 = new sprryg(sprmxg.cfr_renamed_7556(arg1), (sprrk)new sprmwg()).cfr_renamed_7720(sprpqg2.cfr_renamed_7541());
        FileOutputStream fileOutputStream = new FileOutputStream(sprpzg2.cfr_renamed_678());
        InputStream inputStream2 = inputStream;
        sprpqg2.cfr_renamed_7694(new spravg().cfr_renamed_1499("BC"), sprvbh2);
        while ((n = inputStream2.read()) >= 0) {
            inputStream2 = inputStream;
            int n2 = n;
            sprpqg2.cfr_renamed_1221((byte)n2);
            fileOutputStream.write(n2);
        }
        fileOutputStream.close();
        sprtvg sprtvg2 = (sprtvg)sprwvg2.cfr_renamed_7703();
        if (sprpqg2.cfr_renamed_7827(sprtvg2.cfr_renamed_576(0))) {
            System.out.println(sprrtea.cfr_renamed_9("^ J'L=X;Hi[,_ K H-\u0003"));
            return;
        }
        System.out.println(sprusc.cfr_renamed_9("~\u0006j\u0001l\u001bx\u001dhO{\n\u007f\u0006k\u0006n\u000ey\u0006b\u0001-\tl\u0006a\niA"));
    }
}

