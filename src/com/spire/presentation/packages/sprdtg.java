/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczl;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprftg;
import com.spire.presentation.packages.sprgvg;
import com.spire.presentation.packages.sprhah;
import com.spire.presentation.packages.sprkbh;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlbh;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprnwg;
import com.spire.presentation.packages.sprpzg;
import com.spire.presentation.packages.sprrbh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.spruqb;
import com.spire.presentation.packages.sprutg;
import com.spire.presentation.packages.sprwvg;
import com.spire.presentation.packages.sprzzg;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Date;

public class sprdtg {
    private static /* synthetic */ byte[] cfr_renamed_8100(byte[] arg0, String arg1, int arg2) throws IOException {
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprnwg sprnwg2 = new sprnwg(arg2);
        OutputStream outputStream2 = sprnwg2.cfr_renamed_4137(byteArrayOutputStream);
        OutputStream outputStream3 = outputStream = new sprrbh().cfr_renamed_7828(outputStream2, 'b', arg1, arg0.length, new Date());
        outputStream3.write(arg0);
        outputStream3.close();
        sprnwg2.cfr_renamed_2637();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] cfr_renamed_8101(byte[] arg0, char[] arg1, String arg2, int arg3, boolean arg4) throws IOException, sprtqg, NoSuchProviderException {
        OutputStream outputStream;
        sprgvg sprgvg2;
        if (arg2 == null) {
            arg2 = "_CONSOLE";
        }
        byte[] byArray = sprdtg.cfr_renamed_8100(arg0, arg2, 1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream outputStream2 = byteArrayOutputStream;
        if (arg4) {
            outputStream2 = new sprczl(outputStream2);
        }
        sprlbh sprlbh2 = new sprlbh(arg3).cfr_renamed_1555(new SecureRandom()).cfr_renamed_1499("BC");
        sprgvg sprgvg3 = sprgvg2 = new sprgvg(sprlbh2);
        sprgvg sprgvg4 = sprgvg2;
        sprgvg3.cfr_renamed_7868(new sprzzg(arg1).cfr_renamed_1499("BC"));
        OutputStream outputStream3 = outputStream = sprgvg3.cfr_renamed_7859(outputStream2, byArray.length);
        outputStream3.write(byArray);
        outputStream3.close();
        if (arg4) {
            outputStream2.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        char[] cArray = spruqb.cfr_renamed_9("\rg*eiL,m\"").toCharArray();
        byte[] byArray = sprmvo.cfr_renamed_9("IJmCn\u000fv@sCe").getBytes();
        System.out.println(spruqb.cfr_renamed_9("\u001az(|=g'ii^\u000e^iz,}="));
        byte[] byArray2 = sprdtg.cfr_renamed_8101(byArray, cArray, sprmvo.cfr_renamed_9("FvNx"), 3, true);
        System.out.println(new StringBuilder().insert(0, spruqb.cfr_renamed_9("Ck'm;w9z,jij(z(.t.n")).append(new String(byArray2)).append(sprmvo.cfr_renamed_9("&")).toString());
        byte[] byArray3 = sprdtg.cfr_renamed_8102(byArray2, cArray);
        System.out.println(new StringBuilder().insert(0, spruqb.cfr_renamed_9("Cj,m;w9z,jij(z(.t.n")).append(new String(byArray3)).append(sprmvo.cfr_renamed_9("&")).toString());
        byArray2 = sprdtg.cfr_renamed_8101(byArray, cArray, spruqb.cfr_renamed_9("g>o0"), 9, false);
        System.out.println(new StringBuilder().insert(0, sprmvo.cfr_renamed_9("\u000bJoLsVq[dK!K`[`\u000f<\u000f&")).append(new String(sprfqe.cfr_renamed_485(byArray2))).append(spruqb.cfr_renamed_9("n")).toString());
        byArray3 = sprdtg.cfr_renamed_8102(byArray2, cArray);
        System.out.println(new StringBuilder().insert(0, sprmvo.cfr_renamed_9("\u000bKdLsVq[dK!K`[`\u000f<\u000f&")).append(new String(byArray3)).append(spruqb.cfr_renamed_9("n")).toString());
    }

    public static byte[] cfr_renamed_8102(byte[] arg0, char[] arg1) throws IOException, sprtqg, NoSuchProviderException {
        sprkbh sprkbh2;
        sprkbh sprkbh3;
        InputStream inputStream = new ByteArrayInputStream(arg0);
        sprwvg sprwvg2 = new sprwvg(inputStream = sprmxg.cfr_renamed_7556(inputStream));
        Object object = sprwvg2.cfr_renamed_7703();
        sprkbh sprkbh4 = object instanceof sprkbh ? (sprkbh3 = (sprkbh)object) : (sprkbh2 = (sprkbh)sprwvg2.cfr_renamed_7703());
        sprutg sprutg2 = (sprutg)sprkbh4.cfr_renamed_576(0);
        InputStream inputStream2 = sprutg2.cfr_renamed_7825(new sprhah(new sprmrg().cfr_renamed_1499("BC").cfr_renamed_1451()).cfr_renamed_1499("BC").cfr_renamed_1480(arg1));
        sprwvg sprwvg3 = new sprwvg(inputStream2);
        sprftg sprftg2 = (sprftg)sprwvg3.cfr_renamed_7703();
        sprwvg3 = new sprwvg(sprftg2.cfr_renamed_7830());
        return sprkqe.cfr_renamed_471(((sprpzg)sprwvg3.cfr_renamed_7703()).cfr_renamed_2920());
    }
}

