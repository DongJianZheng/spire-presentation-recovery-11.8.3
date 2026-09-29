/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakg;
import com.spire.presentation.packages.sprbwn;
import com.spire.presentation.packages.sprclg;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprep;
import com.spire.presentation.packages.sprhkm;
import com.spire.presentation.packages.sprjg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvzy;
import com.spire.presentation.packages.spryhg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprfql {
    private sprmh cfr_renamed_2;
    private sprjg cfr_renamed_3;
    private sprep cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprhkm cfr_renamed_4365(byte[] arg0) throws sprcsl {
        sprdye sprdye2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream outputStream = this.cfr_renamed_2.cfr_renamed_1442(byteArrayOutputStream);
        try {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(arg0);
            outputStream2.close();
        }
        catch (IOException iOException) {
            throw new sprcsl(new StringBuilder().insert(0, sprvzy.cfr_renamed_9("Mb@mAw\u000es\\lMf]p\u000egOwO9\u000e")).append(iOException.getMessage()).toString(), iOException);
        }
        sprddm sprddm2 = null;
        sprddm sprddm3 = this.cfr_renamed_2.cfr_renamed_615();
        try {
            sprfql sprfql2 = this;
            sprfql2.cfr_renamed_3.cfr_renamed_7424(sprfql2.cfr_renamed_2.cfr_renamed_1521());
            sprfql sprfql3 = this;
            sprdye2 = new sprdye(sprfql3.cfr_renamed_3.cfr_renamed_7424(sprfql3.cfr_renamed_2.cfr_renamed_1521()));
        }
        catch (spryhg spryhg2) {
            throw new sprcsl(new StringBuilder().insert(0, sprbwn.cfr_renamed_9("n|csbi-j\u007f|}=fxt'-")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
        sprddm sprddm4 = this.cfr_renamed_3.cfr_renamed_615();
        sproug sproug2 = null;
        sprdye sprdye3 = new sprdye(byteArrayOutputStream.toByteArray());
        return new sprhkm(sprddm2, sprddm3, sprdye2, sprddm4, sproug2, sprdye3);
    }

    public sprhkm cfr_renamed_1480(char[] arg0) throws sprcsl {
        sprfql sprfql2 = this;
        return sprfql2.cfr_renamed_4365(sprfql2.cfr_renamed_4366(sprkoe.cfr_renamed_432(arg0)));
    }

    public sprfql(sprjg arg0, sprmh arg1) {
        this(arg0, arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprfql(sprjg sprjg2, sprmh sprmh2, sprep sprep2) {
        void arg1;
        void arg0;
        sprfql sprfql2 = this;
        this.cfr_renamed_3 = arg0;
        sprfql2.cfr_renamed_2 = arg1;
        sprfql2.cfr_renamed_4 = sprep2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhkm cfr_renamed_10963(sprcom arg0) throws sprcsl {
        sprclg sprclg2 = new sprclg(arg0);
        sprddm sprddm2 = arg0.cfr_renamed_1254();
        sprddm sprddm3 = this.cfr_renamed_2.cfr_renamed_615();
        try {
            sprakg sprakg2 = sprclg2.cfr_renamed_7357(this.cfr_renamed_2);
            sprfql sprfql2 = this;
            sprdye sprdye2 = new sprdye(sprfql2.cfr_renamed_3.cfr_renamed_7424(sprfql2.cfr_renamed_2.cfr_renamed_1521()));
            sprddm sprddm4 = this.cfr_renamed_3.cfr_renamed_615();
            sproug sproug2 = null;
            return new sprhkm(sprddm2, sprddm3, sprdye2, sprddm4, sproug2, new sprdye(sprakg2.cfr_renamed_1446()));
        }
        catch (IllegalStateException illegalStateException) {
            throw new sprcsl(new StringBuilder().insert(0, sprvzy.cfr_renamed_9("Mb@mAw\u000ef@`AgK#EfW9\u000e")).append(illegalStateException.getMessage()).toString(), illegalStateException);
        }
        catch (spryhg spryhg2) {
            throw new sprcsl(new StringBuilder().insert(0, sprbwn.cfr_renamed_9("n|csbi-j\u007f|}=fxt'-")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 5 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private /* synthetic */ byte[] cfr_renamed_4366(byte[] arg0) {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_3250(arg0);
        }
        return arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhkm cfr_renamed_7464(sprtpl arg0) throws sprcsl {
        try {
            sprfql sprfql2 = this;
            return sprfql2.cfr_renamed_4365(sprfql2.cfr_renamed_4366(arg0.cfr_renamed_91()));
        }
        catch (IOException iOException) {
            throw new sprcsl(new StringBuilder().insert(0, sprvzy.cfr_renamed_9("Mb@mAw\u000ef@`AgK#Mf\\wGeG`OwK9\u000e")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

