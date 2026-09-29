/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpaia;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprruha;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvfja;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxwha;

@sprtea
public class sprmon {
    private static final String cfr_renamed_152 = "((\\-|\\+)?(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))((e|E)(\\-|\\+)?[0-9]+)?)( ?, ?)((\\-|\\+)?(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))((e|E)(\\-|\\+)?[0-9]+)?)(((\\-|\\+)?(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))((e|E)(\\-|\\+)?[0-9]+)?)( ?, ?)((\\-|\\+)?(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))((e|E)(\\-|\\+)?[0-9]+)?))*";
    private char[] cfr_renamed_112;
    private static final String cfr_renamed_119 = "((\\-|\\+)?(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))((e|E)(\\-|\\+)?[0-9]+)?)";
    private static final String cfr_renamed_91 = "(\\+?(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))((e|E)(\\-|\\+)?[0-859 9]+)?) (\\+?(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))((e|E)(\\-|\\+)?[0-9]+)?)( (\\+?(([0-9]+(\\.[0-860 9]+)?)|(\\.[0-9]+))((e|E)(\\-|\\+)?[0-9]+)?) (\\+?(([0-9]+(\\.[0-9]+)?)|(\\.[0-9]+))((e|E)(\\-861 |\\+)?[0-9]+)?))*";
    private char[] cfr_renamed_0;
    private char cfr_renamed_1;
    private int cfr_renamed_2;
    private char[] cfr_renamed_3;
    private String cfr_renamed_4;

    public char cfr_renamed_13360() {
        sprmon sprmon2 = this;
        int n = sprraia.cfr_renamed_13361(sprmon2.cfr_renamed_4, sprmon2.cfr_renamed_0, this.cfr_renamed_2);
        if (n == -1) {
            return '\u0000';
        }
        return this.cfr_renamed_4.charAt(n);
    }

    @sprtea
    public static float cfr_renamed_13362(String arg0) {
        float f = 0.0f;
        float[] fArray = new float[1];
        fArray[0] = f;
        float[] fArray2 = fArray;
        boolean bl = sprpaia.cfr_renamed_13363(arg0, 511, sprvfja.cfr_renamed_12042(), fArray2);
        f = fArray[0];
        if (bl) {
            f = sprpaia.cfr_renamed_13364(arg0, sprvfja.cfr_renamed_12042());
        }
        return f;
    }

    /*
     * WARNING - void declaration
     */
    public sprmon(String string) {
        void arg0;
        sprmon sprmon2 = this;
        sprmon sprmon3 = this;
        char[] cArray = new char[1];
        cArray[0] = 44;
        this.cfr_renamed_3 = cArray;
        char[] cArray2 = new char[1];
        cArray2[0] = 32;
        sprmon3.cfr_renamed_112 = cArray2;
        char[] cArray3 = new char[20];
        cArray3[0] = 70;
        cArray3[1] = 102;
        cArray3[2] = 109;
        cArray3[3] = 77;
        cArray3[4] = 108;
        cArray3[5] = 76;
        cArray3[6] = 104;
        cArray3[7] = 72;
        cArray3[8] = 118;
        cArray3[9] = 86;
        cArray3[10] = 99;
        cArray3[11] = 67;
        cArray3[12] = 113;
        cArray3[13] = 81;
        cArray3[14] = 115;
        cArray3[15] = 83;
        cArray3[16] = 97;
        cArray3[17] = 65;
        cArray3[18] = 122;
        cArray3[19] = 90;
        sprmon3.cfr_renamed_0 = cArray3;
        sprmon2.cfr_renamed_4 = arg0;
        sprmon2.cfr_renamed_2 = 0;
    }

    public boolean cfr_renamed_13365(float[] fArray) {
        arg0[0] = 0.0f;
        sprxwha sprxwha2 = sprruha.cfr_renamed_13366(this.cfr_renamed_4.substring(this.cfr_renamed_2), cfr_renamed_119);
        if (sprxwha2.cfr_renamed_13367()) {
            this.cfr_renamed_13368(sprxwha2.cfr_renamed_320() + sprxwha2.cfr_renamed_13369().cfr_renamed_13370(0).cfr_renamed_97().length());
            arg0[0] = sprmon.cfr_renamed_13362(sprxwha2.cfr_renamed_13369().cfr_renamed_13370(0).cfr_renamed_97());
            return true;
        }
        return false;
    }

    public int cfr_renamed_806() {
        return this.cfr_renamed_4.length();
    }

    public char cfr_renamed_13371() {
        sprmon sprmon2 = this;
        int n = sprraia.cfr_renamed_13361(sprmon2.cfr_renamed_4, sprmon2.cfr_renamed_0, this.cfr_renamed_2);
        if (n == -1) {
            return '\u0000';
        }
        this.cfr_renamed_1 = this.cfr_renamed_4.charAt(n);
        this.cfr_renamed_2 = n + 1;
        return this.cfr_renamed_1;
    }

    public sprsuja[] cfr_renamed_13372() {
        sprvrx<sprsuja> sprvrx2 = new sprvrx<sprsuja>();
        sprsuja sprsuja2 = null;
        sprsuja[] sprsujaArray = new sprsuja[1];
        sprsujaArray[0] = sprsuja2;
        sprsuja[] sprsujaArray2 = sprsujaArray;
        sprmon sprmon2 = this;
        while (!sprmon2.cfr_renamed_13373() && this.cfr_renamed_13374(sprsujaArray2)) {
            sprsuja2 = sprsujaArray2[0];
            sprmon2 = this;
            sprvrx2.add(sprsuja2);
        }
        return (sprsuja[])sprvrx2.toArray();
    }

    public boolean cfr_renamed_13375() {
        block3: {
            block2: {
                sprmon sprmon2 = this;
                if (sprmon2.cfr_renamed_2 == sprmon2.cfr_renamed_4.length()) break block2;
                sprmon sprmon3 = this;
                if (sprraia.cfr_renamed_13361(sprmon3.cfr_renamed_4, sprmon3.cfr_renamed_0, this.cfr_renamed_2) != -1) break block3;
            }
            return true;
        }
        return false;
    }

    public int cfr_renamed_13376() {
        sprmon sprmon2 = this;
        int n = sprraia.cfr_renamed_13361(sprmon2.cfr_renamed_4, sprmon2.cfr_renamed_0, this.cfr_renamed_2);
        if (n == -1) {
            return this.cfr_renamed_4.length();
        }
        return n;
    }

    public void cfr_renamed_13368(int arg0) {
        this.cfr_renamed_2 += arg0;
    }

    public int cfr_renamed_3274() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_13374(sprsuja[] sprsujaArray) {
        arg0[0] = sprsuja.cfr_renamed_13377();
        sprmon sprmon2 = this;
        int n = this.cfr_renamed_13376() - sprmon2.cfr_renamed_2;
        sprmon sprmon3 = this;
        sprxwha sprxwha2 = sprruha.cfr_renamed_13366(sprmon2.cfr_renamed_4.substring(sprmon3.cfr_renamed_2, sprmon3.cfr_renamed_2 + n), cfr_renamed_152);
        if (sprxwha2.cfr_renamed_13367()) {
            String string = sprxwha2.cfr_renamed_13369().cfr_renamed_13370(0).cfr_renamed_97();
            sprmon sprmon4 = this;
            sprmon4.cfr_renamed_13368(sprxwha2.cfr_renamed_320() + string.length());
            String[] stringArray = sprraia.cfr_renamed_13378(string, sprmon4.cfr_renamed_3);
            arg0[0] = new sprsuja(sprmon.cfr_renamed_13362(sprraia.cfr_renamed_12806(stringArray[0])), sprmon.cfr_renamed_13362(sprraia.cfr_renamed_12806(stringArray[1])));
            return true;
        }
        return false;
    }

    public void cfr_renamed_13379(int arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 1 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ 5 << 1;
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

    private /* synthetic */ boolean cfr_renamed_13373() {
        sprmon sprmon2 = this;
        return sprraia.cfr_renamed_13361(sprmon2.cfr_renamed_4, sprmon2.cfr_renamed_0, this.cfr_renamed_2) == this.cfr_renamed_2 + 1;
    }
}

