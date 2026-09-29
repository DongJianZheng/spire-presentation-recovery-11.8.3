/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravg;
import com.spire.presentation.packages.sprazg;
import com.spire.presentation.packages.sprczl;
import com.spire.presentation.packages.sprebh;
import com.spire.presentation.packages.sprftg;
import com.spire.presentation.packages.sprhym;
import com.spire.presentation.packages.spriyg;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprqrg;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprryg;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprssg;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtvg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprwvg;
import com.spire.presentation.packages.sprytf;
import com.spire.presentation.packages.sprzyg;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.Security;

public class sprevg {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void cfr_renamed_8081(String arg0, String arg1, String arg2) throws GeneralSecurityException, IOException, sprtqg {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg1));
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(arg2));
        try {
            sprevg.cfr_renamed_8082(arg0, bufferedInputStream, bufferedInputStream2);
            return;
        }
        finally {
            ((InputStream)bufferedInputStream2).close();
            ((InputStream)bufferedInputStream).close();
        }
    }

    private static /* synthetic */ void cfr_renamed_8083(String arg0, InputStream arg1, OutputStream arg2, char[] arg3, boolean arg4) throws GeneralSecurityException, IOException, sprtqg {
        int n;
        BufferedInputStream bufferedInputStream;
        spriyg spriyg2;
        if (arg4) {
            arg2 = new sprczl(arg2);
        }
        sprmah sprmah2 = (spriyg2 = sprazg.cfr_renamed_8058(arg1)).cfr_renamed_7744(new sprqrg().cfr_renamed_1499("BC").cfr_renamed_1480(arg3));
        sprssg sprssg2 = new sprssg(new sprebh(spriyg2.cfr_renamed_1157().cfr_renamed_593(), 2).cfr_renamed_1499("BC"));
        sprssg2.cfr_renamed_7538(0, sprmah2);
        sprjah sprjah2 = new sprjah(arg2);
        BufferedInputStream bufferedInputStream2 = bufferedInputStream = new BufferedInputStream(new FileInputStream(arg0));
        while ((n = ((InputStream)bufferedInputStream2).read()) >= 0) {
            bufferedInputStream2 = bufferedInputStream;
            sprssg2.cfr_renamed_1221((byte)n);
        }
        ((InputStream)bufferedInputStream).close();
        sprssg2.cfr_renamed_31().cfr_renamed_2623(sprjah2);
        if (arg4) {
            arg2.close();
        }
    }

    private static /* synthetic */ void cfr_renamed_8082(String arg0, InputStream arg1, InputStream arg2) throws GeneralSecurityException, IOException, sprtqg {
        int n;
        sprtvg sprtvg2;
        Object object;
        sprwvg sprwvg2 = new sprwvg(arg1 = sprmxg.cfr_renamed_7556(arg1));
        Object object2 = sprwvg2.cfr_renamed_7703();
        if (object2 instanceof sprftg) {
            object = (sprftg)object2;
            sprwvg2 = new sprwvg(((sprftg)object).cfr_renamed_7830());
            sprtvg2 = (sprtvg)sprwvg2.cfr_renamed_7703();
        } else {
            sprtvg2 = (sprtvg)object2;
        }
        object = new sprryg(sprmxg.cfr_renamed_7556(arg2), (sprrk)new sprmwg());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg0));
        sprzyg sprzyg2 = sprtvg2.cfr_renamed_576(0);
        sprvbh sprvbh2 = ((sprryg)object).cfr_renamed_7720(sprzyg2.cfr_renamed_7541());
        BufferedInputStream bufferedInputStream2 = bufferedInputStream;
        sprzyg2.cfr_renamed_7694(new spravg().cfr_renamed_1499("BC"), sprvbh2);
        while ((n = ((InputStream)bufferedInputStream2).read()) >= 0) {
            bufferedInputStream2 = bufferedInputStream;
            sprzyg2.cfr_renamed_1221((byte)n);
        }
        ((InputStream)bufferedInputStream).close();
        if (sprzyg2.cfr_renamed_1626()) {
            System.out.println(sprytf.cfr_renamed_9("\u0015c\u0001d\u0007~\u0013x\u0003*\u0010o\u0014c\u0000c\u0003nH"));
            return;
        }
        System.out.println(sprhym.cfr_renamed_9("\u001b0\u000f7\t-\u001d+\ry\u001e<\u001a0\u000e0\u000b8\u001c0\u00077H?\t0\u0004<\fw"));
    }

    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        if (arg0[0].equals(sprytf.cfr_renamed_9("'\u0015"))) {
            if (arg0[1].equals(sprhym.cfr_renamed_9("E8"))) {
                sprevg.cfr_renamed_8084(arg0[2], arg0[3], new StringBuilder().insert(0, arg0[2]).append(sprytf.cfr_renamed_9("$\u0007y\u0005")).toString(), arg0[4].toCharArray(), true);
                return;
            }
            sprevg.cfr_renamed_8084(arg0[1], arg0[2], new StringBuilder().insert(0, arg0[1]).append(sprhym.cfr_renamed_9("F;\u0018>")).toString(), arg0[3].toCharArray(), false);
            return;
        }
        if (arg0[0].equals(sprytf.cfr_renamed_9("'\u0010"))) {
            sprevg.cfr_renamed_8081(arg0[1], arg0[2], arg0[3]);
            return;
        }
        System.err.println(sprhym.cfr_renamed_9(",\u001b8\u000f<Ry,<\u001c8\u000b1\r=;0\u000f7\t-\u001d+\r\t\u001a6\u000b<\u001b*\u0007+H\u0002E*H\u0002E85y\u000e0\u0004<H2\r \u000e0\u0004<H)\t*\u001b\t\u0000+\t*\r\u0004\u0014\u0002E/H?\u00015\ry\u001b0\u000f\u001f\u00015\ry\u0003<\u0011\u001f\u00015\r\u0004"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void cfr_renamed_8084(String arg0, String arg1, String arg2, char[] arg3, boolean arg4) throws GeneralSecurityException, IOException, sprtqg {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg1));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(arg2));
        try {
            sprevg.cfr_renamed_8083(arg0, bufferedInputStream, bufferedOutputStream, arg3, arg4);
            return;
        }
        finally {
            ((OutputStream)bufferedOutputStream).close();
            ((InputStream)bufferedInputStream).close();
        }
    }
}

