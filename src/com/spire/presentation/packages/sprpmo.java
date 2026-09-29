/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdrja;
import com.spire.presentation.packages.spreso;
import com.spire.presentation.packages.sprfqja;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgvja;
import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprmvja;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxln;
import java.util.ArrayList;

@sprtea
public class sprpmo {
    private byte[] cfr_renamed_2;
    private sprsuja[] cfr_renamed_3;
    @sprtea
    public sprdrja cfr_renamed_4;

    @sprtea
    public void cfr_renamed_16990() {
        this.cfr_renamed_4.cfr_renamed_16990();
    }

    @sprtea
    public void cfr_renamed_17008(sprtbp arg0) {
        this.cfr_renamed_4.cfr_renamed_17009(spreso.cfr_renamed_16967(arg0));
    }

    public void cfr_renamed_11665() {
        this.cfr_renamed_4.dispose();
    }

    @sprtea
    public void cfr_renamed_17010(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.cfr_renamed_4.cfr_renamed_17010(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @sprtea
    public void cfr_renamed_17011(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.cfr_renamed_4.cfr_renamed_17011(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @sprtea
    public void cfr_renamed_17012(float arg0, float arg1, float arg2, float arg3) {
        this.cfr_renamed_4.cfr_renamed_17012(arg0, arg1, arg2, arg3);
    }

    @sprtea
    public void cfr_renamed_17013(sprgeja arg0, float arg1, float arg2) {
        this.cfr_renamed_4.cfr_renamed_17013(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprpmo(sprsuja[] sprsujaArray, byte[] byArray, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprpmo sprpmo2 = this;
        sprpmo2.cfr_renamed_4 = new sprdrja((sprsuja[])arg0, (byte[])arg1, (int)arg2);
    }

    @sprtea
    public boolean cfr_renamed_12627(float arg0, float arg1) {
        return this.cfr_renamed_4.cfr_renamed_12627(arg0, arg1);
    }

    @sprtea
    public void cfr_renamed_17014(sprsuja[] arg0) {
        this.cfr_renamed_4.cfr_renamed_17014(arg0);
    }

    @sprtea
    public void cfr_renamed_17015() {
        this.cfr_renamed_4.cfr_renamed_17015();
    }

    @sprtea
    public void cfr_renamed_17016(sprgeja arg0) {
        this.cfr_renamed_4.cfr_renamed_17016(arg0);
    }

    @sprtea
    public void cfr_renamed_13650(sprgeja arg0) {
        this.cfr_renamed_4.cfr_renamed_13650(arg0);
    }

    @sprtea
    public void cfr_renamed_9979() {
        this.cfr_renamed_4.cfr_renamed_9979();
    }

    @sprtea
    public void cfr_renamed_13641(sprsuja arg0, sprsuja arg1) {
        this.cfr_renamed_4.cfr_renamed_13641(arg0, arg1);
    }

    @sprtea
    public void cfr_renamed_17017(sprsuja[] arg0) {
        this.cfr_renamed_4.cfr_renamed_17017(arg0);
    }

    @sprtea
    public void cfr_renamed_16992(sprsuja arg0, sprsuja arg1, sprsuja arg2, sprsuja arg3) {
        this.cfr_renamed_4.cfr_renamed_16992(arg0, arg1, arg2, arg3);
    }

    @sprtea
    public void cfr_renamed_16987(sprsuja[] arg0) {
        this.cfr_renamed_4.cfr_renamed_16987(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprpmo(sprsuja[] sprsujaArray, byte[] byArray) {
        void arg1;
        void arg0;
        sprpmo sprpmo2 = this;
        sprpmo2.cfr_renamed_4 = new sprdrja((sprsuja[])arg0, (byte[])arg1);
    }

    @sprtea
    public void cfr_renamed_12624(sprqgp arg0) {
        this.cfr_renamed_4.cfr_renamed_16359(new sprfqja(arg0.cfr_renamed_12595(), arg0.cfr_renamed_12596(), arg0.cfr_renamed_12597(), arg0.cfr_renamed_12598(), arg0.cfr_renamed_12599(), arg0.cfr_renamed_12600()));
    }

    public sprpmo() {
        sprpmo sprpmo2 = this;
        sprpmo2.cfr_renamed_4 = new sprdrja();
    }

    @sprtea
    public void cfr_renamed_17018(sprqgp arg0, float arg1) {
        sprfqja sprfqja2 = new sprfqja(arg0.cfr_renamed_12595(), arg0.cfr_renamed_12596(), arg0.cfr_renamed_12597(), arg0.cfr_renamed_12598(), arg0.cfr_renamed_12599(), arg0.cfr_renamed_12600());
        this.cfr_renamed_4.cfr_renamed_17019(sprfqja2, arg1);
    }

    @sprtea
    public void cfr_renamed_17020(sprpeja arg0, float arg1, float arg2) {
        this.cfr_renamed_4.cfr_renamed_17020(arg0, arg1, arg2);
    }

    public sprsuja[] cfr_renamed_17007() {
        return this.cfr_renamed_4.cfr_renamed_17007();
    }

    @sprtea
    public static sprxln cfr_renamed_17021(sprsuja[] arg0, int[] arg1) {
        int n;
        int n2;
        boolean bl = false;
        Object object = arg1;
        int n3 = arg1.length;
        int n4 = n2 = 0;
        while (n4 < n3) {
            int n5 = object[n2];
            if ((n5 & 0x80) == 128) {
                bl = true;
            }
            n4 = ++n2;
        }
        object = new sprxln();
        sprlsn sprlsn2 = new sprlsn();
        ((sprkmn)object).cfr_renamed_12507(sprlsn2);
        if (bl) {
            sprlsn2.cfr_renamed_12625(bl);
            sprsuja[] sprsujaArray = new sprsuja[arg1.length + 1];
            int[] nArray = new int[arg1.length + 1];
            System.arraycopy(arg0, 0, sprsujaArray, 0, arg0.length);
            sprsujaArray[arg1.length] = arg0[0];
            System.arraycopy(arg1, 0, nArray, 0, arg1.length);
            nArray[arg1.length] = arg1[arg1.length - 1];
            int[] nArray2 = arg1;
            int n6 = arg1.length - 1;
            nArray2[n6] = nArray2[n6] & 7;
        }
        sprwvn sprwvn2 = null;
        int n7 = 0;
        int n8 = n = 0;
        while (n8 < arg0.length) {
            if (arg1[n] == 0) {
                sprwvn2 = new sprwvn();
            }
            if (n7 != 0 && n7 != arg1[n]) {
                sprpmo.cfr_renamed_17022(sprlsn2, sprwvn2, n7);
                sprwvn2 = new sprwvn();
                if (n > 0) {
                    sprovja.cfr_renamed_11658(sprwvn2, arg0[n - 1]);
                }
            }
            if (sprwvn2 != null) {
                sprovja.cfr_renamed_11658(sprwvn2, arg0[n]);
            }
            n7 = arg1[n];
            if (n == arg0.length - 1 && sprwvn2 != null) {
                sprpmo.cfr_renamed_17022(sprlsn2, sprwvn2, n7);
            }
            n8 = ++n;
        }
        return object;
    }

    @sprtea
    public void cfr_renamed_17023(float arg0, float arg1, float arg2, float arg3) {
        this.cfr_renamed_4.cfr_renamed_17023(arg0, arg1, arg2, arg3);
    }

    @sprtea
    public sprxln cfr_renamed_17024() {
        int n;
        int[] nArray = new int[this.cfr_renamed_17025().length];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_17025().length) {
            int n3 = n++;
            nArray[n3] = this.cfr_renamed_17025()[n3] & 0xFF;
            n2 = n;
        }
        return sprpmo.cfr_renamed_17021(this.cfr_renamed_17007(), nArray);
    }

    @sprtea
    public sprgeja cfr_renamed_8505() {
        return sprgeja.cfr_renamed_16991(this.cfr_renamed_4.getBounds());
    }

    @sprtea
    public static sprxln cfr_renamed_17026(sprsuja[] arg0, byte[] arg1) {
        int n;
        int[] nArray = new int[arg1.length];
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3 = n++;
            nArray[n3] = arg1[n3] & 0xFF;
            n2 = n;
        }
        return sprpmo.cfr_renamed_17021(arg0, nArray);
    }

    public int cfr_renamed_12609() {
        return this.cfr_renamed_4.cfr_renamed_12609();
    }

    @sprtea
    public void cfr_renamed_16337() {
        this.cfr_renamed_4.cfr_renamed_16337();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_17022(sprlsn arg0, sprwvn arg1, int arg2) {
        switch (arg2 & 7) {
            case 1: {
                arg0.cfr_renamed_13645((sprsuja[])sprovja.cfr_renamed_13436((ArrayList)sprwvn.cfr_renamed_13437(arg1), sprsuja.class), true);
                return;
            }
            case 3: {
                arg0.cfr_renamed_13643((sprsuja[])sprovja.cfr_renamed_13436((ArrayList)sprwvn.cfr_renamed_13437(arg1), sprsuja.class));
                return;
            }
        }
    }

    public int cfr_renamed_17005() {
        return this.cfr_renamed_4.cfr_renamed_17005();
    }

    public byte[] cfr_renamed_17025() {
        return this.cfr_renamed_4.cfr_renamed_17025();
    }

    @sprtea
    public void cfr_renamed_17027(sprgvja[] arg0) {
        this.cfr_renamed_4.cfr_renamed_17027(arg0);
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_4.cfr_renamed_17005();
    }

    public sprmvja cfr_renamed_17028() {
        return this.cfr_renamed_4.cfr_renamed_17028();
    }
}

