/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczl;
import com.spire.presentation.packages.sprftg;
import com.spire.presentation.packages.sprgvg;
import com.spire.presentation.packages.sprhah;
import com.spire.presentation.packages.sprhqba;
import com.spire.presentation.packages.sprkbh;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlbh;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprnwg;
import com.spire.presentation.packages.sprpzg;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprutg;
import com.spire.presentation.packages.sprvd;
import com.spire.presentation.packages.sprver;
import com.spire.presentation.packages.sprwvg;
import com.spire.presentation.packages.sprzzg;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.security.Security;

public class sprosg {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void cfr_renamed_8066(OutputStream arg0, String arg1, char[] arg2, boolean arg3) throws IOException {
        if (arg3) {
            arg0 = new sprczl(arg0);
        }
        File file = new File(arg1);
        try {
            sprgvg sprgvg2;
            sprvd sprvd2 = new sprlbh(9).cfr_renamed_1499("BC").cfr_renamed_1555(new SecureRandom()).cfr_renamed_7906(true);
            sprgvg sprgvg3 = sprgvg2 = new sprgvg(sprvd2);
            sprgvg sprgvg4 = sprgvg2;
            sprgvg3.cfr_renamed_7868(new sprzzg(arg2).cfr_renamed_1499("BC"));
            OutputStream outputStream = sprgvg3.cfr_renamed_7847(arg0, new byte[8192]);
            OutputStream outputStream2 = new sprnwg(1).cfr_renamed_4137(outputStream);
            OutputStream outputStream3 = outputStream;
            OutputStream outputStream4 = outputStream2;
            sprmxg.cfr_renamed_7551(outputStream4, 'b', file);
            outputStream4.flush();
            outputStream4.close();
            outputStream3.flush();
            outputStream3.close();
            if (!arg3) return;
            OutputStream outputStream5 = arg0;
            outputStream5.flush();
            outputStream5.close();
            return;
        }
        catch (sprtqg sprtqg2) {
            System.err.println(sprtqg2);
            if (sprtqg2.cfr_renamed_584() == null) return;
            sprtqg2.cfr_renamed_584().printStackTrace();
        }
    }

    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        if (arg0[0].equals(sprver.cfr_renamed_9("\t5"))) {
            if (arg0[1].equals(sprhqba.cfr_renamed_9("\u0016^"))) {
                sprosg.cfr_renamed_8067(new StringBuilder().insert(0, arg0[2]).append(sprver.cfr_renamed_9("\n1W3")).toString(), arg0[2], arg0[3].toCharArray(), true);
                return;
            }
            sprosg.cfr_renamed_8067(new StringBuilder().insert(0, arg0[1]).append(sprhqba.cfr_renamed_9("\u0015]KX")).toString(), arg0[1], arg0[2].toCharArray(), false);
            return;
        }
        if (arg0[0].equals(sprver.cfr_renamed_9("\t4"))) {
            sprosg.cfr_renamed_8068(arg0[1], arg0[2].toCharArray());
            return;
        }
        System.err.println(sprhqba.cfr_renamed_9("NLZX^\u0005\u001boyz}VWZkMT\\^LHPI\u001f\u0016Z\u001bd\u0016^fC\u0016[\u001bYRS^\u001fK^HLkWI^HZ"));
    }

    private static /* synthetic */ void cfr_renamed_8067(String arg0, String arg1, char[] arg2, boolean arg3) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(arg0));
        sprosg.cfr_renamed_8066(bufferedOutputStream, arg1, arg2, arg3);
        ((OutputStream)bufferedOutputStream).close();
    }

    private static /* synthetic */ void cfr_renamed_8069(InputStream arg0, char[] arg1) throws IOException, sprtqg {
        FileOutputStream fileOutputStream;
        Object object;
        sprkbh sprkbh2;
        sprkbh sprkbh3;
        sprwvg sprwvg2 = new sprwvg(arg0 = sprmxg.cfr_renamed_7556(arg0));
        Object object2 = sprwvg2.cfr_renamed_7703();
        sprutg sprutg2 = (sprutg)(object2 instanceof sprkbh ? (sprkbh3 = (sprkbh)object2) : (sprkbh2 = (sprkbh)sprwvg2.cfr_renamed_7703())).cfr_renamed_576(0);
        if (!sprutg2.cfr_renamed_7846()) {
            throw new sprtqg(sprver.cfr_renamed_9("\u001dA#W1C5\u00049WpJ?PpM>P5C\"M$]pT\"K$A3P5@q"));
        }
        sprhah sprhah2 = new sprhah(new sprmrg().cfr_renamed_1499("BC").cfr_renamed_1451()).cfr_renamed_1499("BC");
        InputStream inputStream = sprutg2.cfr_renamed_7825(sprhah2.cfr_renamed_1480(arg1));
        sprwvg2 = new sprwvg(inputStream);
        object2 = sprwvg2.cfr_renamed_7703();
        if (object2 instanceof sprftg) {
            object = (sprftg)object2;
            sprwvg2 = new sprwvg(((sprftg)object).cfr_renamed_7830());
            object2 = sprwvg2.cfr_renamed_7703();
        }
        object = (sprpzg)object2;
        InputStream inputStream2 = ((sprpzg)object).cfr_renamed_2920();
        FileOutputStream fileOutputStream2 = fileOutputStream = new FileOutputStream(((sprpzg)object).cfr_renamed_678());
        sprkqe.cfr_renamed_5195(inputStream2, fileOutputStream2, 8192);
        ((OutputStream)fileOutputStream2).close();
        if (!sprutg2.cfr_renamed_1626()) {
            System.err.println(sprhqba.cfr_renamed_9("VZHLZX^\u001f]^RS^[\u001bVUK^XIVOF\u001b\\SZXT"));
            return;
        }
        System.err.println(sprver.cfr_renamed_9("I5W#E7ApM>P5C\"M$]pG8A3OpT1W#A4"));
    }

    private static /* synthetic */ void cfr_renamed_8068(String arg0, char[] arg1) throws IOException, sprtqg {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg0));
        sprosg.cfr_renamed_8069(bufferedInputStream, arg1);
        ((InputStream)bufferedInputStream).close();
    }
}

