/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprare;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcmp;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprtse;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprdne
extends sprkra {
    private sprmee cfr_renamed_79;
    private sprmee cfr_renamed_107;
    private sprije cfr_renamed_132;
    private sprxue cfr_renamed_102;
    private sprbne cfr_renamed_93;
    private sprxue cfr_renamed_86;
    private sprrpe cfr_renamed_152;
    private sprxue cfr_renamed_112;
    private sprtse cfr_renamed_119;
    public static final sprmee cfr_renamed_91 = new sprmee(spruhe.cfr_renamed_23(new sprpse()));
    public static final int cfr_renamed_0 = 2;
    private sprxue cfr_renamed_1;
    private sprxue cfr_renamed_2;
    private sprooe cfr_renamed_3;
    public static final int cfr_renamed_4 = 1;

    /*
     * WARNING - void declaration
     */
    public sprdne(int n, sprmee sprmee2, sprmee sprmee3) {
        this(new sprooe((long)arg0), (sprmee)arg1, (sprmee)arg2);
        void arg2;
        void arg1;
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprdne(sprbne arg0) {
        spryte spryte2;
        sprdne sprdne2 = this;
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprdne2.cfr_renamed_3 = sprooe.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_79 = sprmee.cfr_renamed_23(enumeration.nextElement());
        sprdne2.cfr_renamed_107 = sprmee.cfr_renamed_23(enumeration.nextElement());
        block11: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            spryte2 = (spryte)enumeration.nextElement();
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_152 = sprrpe.cfr_renamed_341(spryte2, true);
                    continue block11;
                }
                case 1: {
                    this.cfr_renamed_132 = sprije.cfr_renamed_341(spryte2, true);
                    continue block11;
                }
                case 2: {
                    this.cfr_renamed_86 = sprxue.cfr_renamed_341(spryte2, true);
                    continue block11;
                }
                case 3: {
                    this.cfr_renamed_112 = sprxue.cfr_renamed_341(spryte2, true);
                    continue block11;
                }
                case 4: {
                    this.cfr_renamed_1 = sprxue.cfr_renamed_341(spryte2, true);
                    continue block11;
                }
                case 5: {
                    this.cfr_renamed_2 = sprxue.cfr_renamed_341(spryte2, true);
                    continue block11;
                }
                case 6: {
                    this.cfr_renamed_102 = sprxue.cfr_renamed_341(spryte2, true);
                    continue block11;
                }
                case 7: {
                    this.cfr_renamed_119 = sprtse.cfr_renamed_341(spryte2, true);
                    continue block11;
                }
                case 8: {
                    this.cfr_renamed_93 = sprbne.cfr_renamed_341(spryte2, true);
                    continue block11;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcmp.cfr_renamed_9("#h=h9q8&\"g1&8s;d3tl&")).append(spryte2.cfr_renamed_312()).toString());
    }

    public static sprdne cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdne) {
            return (sprdne)arg0;
        }
        if (arg0 != null) {
            return new sprdne(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprdne sprdne2 = this;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_79);
        sprlre2.cfr_renamed_49(sprdne2.cfr_renamed_107);
        sprdne sprdne3 = this;
        sprlre sprlre4 = sprlre2;
        sprdne sprdne4 = this;
        sprlre sprlre5 = sprlre2;
        sprdne sprdne5 = this;
        sprdne5.cfr_renamed_4814(sprlre2, 0, this.cfr_renamed_152);
        sprdne5.cfr_renamed_4814(sprlre2, 1, this.cfr_renamed_132);
        this.cfr_renamed_4814(sprlre5, 2, this.cfr_renamed_86);
        sprdne4.cfr_renamed_4814(sprlre5, 3, this.cfr_renamed_112);
        sprdne4.cfr_renamed_4814(sprlre2, 4, this.cfr_renamed_1);
        this.cfr_renamed_4814(sprlre4, 5, this.cfr_renamed_2);
        sprdne3.cfr_renamed_4814(sprlre4, 6, this.cfr_renamed_102);
        sprdne3.cfr_renamed_4814(sprlre2, 7, this.cfr_renamed_119);
        sprdne2.cfr_renamed_4814(sprlre2, 8, this.cfr_renamed_93);
        return new sprpse(sprlre2);
    }

    public sprrpe cfr_renamed_4870() {
        return this.cfr_renamed_152;
    }

    public sprxue cfr_renamed_4871() {
        return this.cfr_renamed_2;
    }

    public sprxue cfr_renamed_4872() {
        return this.cfr_renamed_112;
    }

    public sprtse cfr_renamed_4873() {
        return this.cfr_renamed_119;
    }

    public sprooe cfr_renamed_4874() {
        return this.cfr_renamed_3;
    }

    public sprmee cfr_renamed_4875() {
        return this.cfr_renamed_107;
    }

    public sprxue cfr_renamed_4876() {
        return this.cfr_renamed_102;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdne(sprooe sprooe2, sprmee sprmee2, sprmee sprmee3) {
        void arg1;
        void arg0;
        sprdne sprdne2 = this;
        this.cfr_renamed_3 = arg0;
        sprdne2.cfr_renamed_79 = arg1;
        sprdne2.cfr_renamed_107 = sprmee3;
    }

    public sprije cfr_renamed_4410() {
        return this.cfr_renamed_132;
    }

    public sprare[] cfr_renamed_4877() {
        int n;
        if (this.cfr_renamed_93 == null) {
            return null;
        }
        sprare[] sprareArray = new sprare[this.cfr_renamed_93.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprareArray.length) {
            int n3 = n++;
            sprareArray[n3] = sprare.cfr_renamed_23(this.cfr_renamed_93.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprareArray;
    }

    public sprxue cfr_renamed_4878() {
        return this.cfr_renamed_86;
    }

    private /* synthetic */ void cfr_renamed_4814(sprlre arg0, int arg1, spra arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_49(new sprhse(true, arg1, arg2));
        }
    }

    public sprxue cfr_renamed_4879() {
        return this.cfr_renamed_1;
    }

    public sprmee cfr_renamed_4381() {
        return this.cfr_renamed_79;
    }
}

