/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcle;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprng;
import com.spire.presentation.packages.sprqme;
import com.spire.presentation.packages.sprtue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

public class sprlfg
extends BufferedWriter {
    private char[] cfr_renamed_2 = new char[64];
    private static final int cfr_renamed_3 = 64;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_482(String string) throws IOException {
        void arg0;
        sprlfg sprlfg2 = this;
        sprlfg2.write("-----BEGIN " + (String)arg0 + "-----");
        sprlfg2.newLine();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_484(String string) throws IOException {
        void arg0;
        sprlfg sprlfg2 = this;
        sprlfg2.write("-----END " + (String)arg0 + "-----");
        sprlfg2.newLine();
    }

    /*
     * WARNING - void declaration
     */
    public sprlfg(Writer writer) {
        super((Writer)arg0);
        void arg0;
        String string = sprkoe.cfr_renamed_5114();
        if (string != null) {
            this.cfr_renamed_4 = string.length();
            return;
        }
        this.cfr_renamed_4 = 2;
    }

    public void cfr_renamed_5198(sprng arg0) throws IOException {
        sprcle sprcle2;
        sprcle sprcle3 = sprcle2 = arg0.cfr_renamed_31();
        this.cfr_renamed_482(sprcle3.cfr_renamed_324());
        if (!sprcle3.cfr_renamed_479().isEmpty()) {
            Iterator iterator;
            Iterator iterator2 = iterator = sprcle2.cfr_renamed_479().iterator();
            while (iterator2.hasNext()) {
                sprqme sprqme2 = (sprqme)iterator.next();
                iterator2 = iterator;
                sprlfg sprlfg2 = this;
                this.write(sprqme2.cfr_renamed_313());
                sprlfg2.write(": ");
                sprlfg2.write(sprqme2.cfr_renamed_97());
                sprlfg2.newLine();
            }
            this.newLine();
        }
        sprlfg sprlfg3 = this;
        sprcle sprcle4 = sprcle2;
        sprlfg3.cfr_renamed_483(sprcle4.cfr_renamed_480());
        sprlfg3.cfr_renamed_484(sprcle4.cfr_renamed_324());
    }

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = 2;
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

    private /* synthetic */ void cfr_renamed_483(byte[] arg0) throws IOException {
        int n;
        arg0 = sprtue.cfr_renamed_485(arg0);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlfg sprlfg2;
            int n3;
            block3: {
                int n4 = n3 = 0;
                while (n4 != this.cfr_renamed_2.length) {
                    if (n + n3 >= arg0.length) {
                        sprlfg2 = this;
                        break block3;
                    }
                    int n5 = n3++;
                    this.cfr_renamed_2[n5] = (char)arg0[n + n5];
                    n4 = n3;
                }
                sprlfg2 = this;
            }
            sprlfg2.write(this.cfr_renamed_2, 0, n3);
            this.newLine();
            n2 = n + this.cfr_renamed_2.length;
        }
    }

    public int cfr_renamed_5199(sprcle arg0) {
        int n;
        int n2 = 2 * (arg0.cfr_renamed_324().length() + 10 + this.cfr_renamed_4) + 6 + 4;
        if (!arg0.cfr_renamed_479().isEmpty()) {
            Iterator iterator;
            Iterator iterator2 = iterator = arg0.cfr_renamed_479().iterator();
            while (iterator2.hasNext()) {
                sprqme sprqme2 = (sprqme)iterator.next();
                n2 += sprqme2.cfr_renamed_313().length() + ": ".length() + sprqme2.cfr_renamed_97().length() + this.cfr_renamed_4;
                iterator2 = iterator;
            }
            n2 += this.cfr_renamed_4;
        }
        int n3 = n = (arg0.cfr_renamed_480().length + 2) / 3 * 4;
        return n2 += n3 + (n3 + 64 - 1) / 64 * this.cfr_renamed_4;
    }
}

