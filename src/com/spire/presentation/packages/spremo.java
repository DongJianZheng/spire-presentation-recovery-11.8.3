/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprggo;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprjlo;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxno;

@sprtea
public class spremo {
    private sprpdja cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private sprggo cfr_renamed_2;
    private int cfr_renamed_3;
    private boolean cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ (2 ^ 5);
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

    public spremo(sprggo sprggo2) {
        this.cfr_renamed_2 = sprggo2;
    }

    private /* synthetic */ sprhio cfr_renamed_16064() {
        return this.cfr_renamed_2.cfr_renamed_16064();
    }

    private /* synthetic */ sprxno cfr_renamed_16063() {
        return this.cfr_renamed_2.cfr_renamed_16063();
    }

    public void cfr_renamed_16611() {
        spremo spremo2 = this;
        boolean bl = spremo2.cfr_renamed_16063().cfr_renamed_4690().cfr_renamed_16584(0);
        int n = spremo2.cfr_renamed_16063().cfr_renamed_4690().cfr_renamed_16591(1, 7);
        int n2 = spremo2.cfr_renamed_16063().cfr_renamed_4690().cfr_renamed_16591(8, 15);
        if (spremo2.cfr_renamed_4) {
            spremo spremo3 = this;
            this.cfr_renamed_16064().cfr_renamed_12261();
            byte[] byArray = this.cfr_renamed_16064().cfr_renamed_16065(spremo3.cfr_renamed_16063().cfr_renamed_16058() - 4);
            spremo3.cfr_renamed_91.cfr_renamed_4924(byArray, 0, byArray.length);
            if (!bl || this.cfr_renamed_91.cfr_renamed_806() >= (long)this.cfr_renamed_1) {
                this.cfr_renamed_16696();
                return;
            }
        } else {
            spremo spremo4 = this;
            spremo4.cfr_renamed_91 = new sprpdja();
            spremo4.cfr_renamed_0 = n2;
            this.cfr_renamed_3 = n;
            if (bl) {
                spremo spremo5 = this;
                spremo5.cfr_renamed_4 = true;
                spremo5.cfr_renamed_1 = spremo5.cfr_renamed_16064().cfr_renamed_12261();
                byte[] byArray = spremo5.cfr_renamed_16064().cfr_renamed_16065(this.cfr_renamed_16063().cfr_renamed_16058() - 4);
                spremo5.cfr_renamed_91.cfr_renamed_4924(byArray, 0, byArray.length);
                return;
            }
            spremo spremo6 = this;
            spremo6.cfr_renamed_1 = spremo6.cfr_renamed_16063().cfr_renamed_16058();
            byte[] byArray = spremo6.cfr_renamed_16064().cfr_renamed_16065(this.cfr_renamed_16063().cfr_renamed_16058());
            spremo6.cfr_renamed_91.cfr_renamed_4924(byArray, 0, byArray.length);
            this.cfr_renamed_16696();
        }
    }

    private /* synthetic */ void cfr_renamed_16696() {
        this.cfr_renamed_91.cfr_renamed_11548(0L);
        spremo spremo2 = this;
        spremo spremo3 = this;
        Object object = new sprjlo(spremo2.cfr_renamed_91, spremo2.cfr_renamed_2).cfr_renamed_16693(spremo3.cfr_renamed_3, (int)spremo3.cfr_renamed_91.cfr_renamed_806());
        if (object == null) {
            return;
        }
        spremo spremo4 = this;
        spremo4.cfr_renamed_2.cfr_renamed_16558().cfr_renamed_13414(this.cfr_renamed_0, object);
        sprmvo.cfr_renamed_16697(spremo4.cfr_renamed_91);
        spremo4.cfr_renamed_91 = null;
        this.cfr_renamed_4 = false;
    }
}

