/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprmfaa;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.io.IOException;
import java.util.Enumeration;

public class sprdpe
extends spryte {
    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_4613(sprope sprope2) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_4781(160, this.cfr_renamed_2);
        v0.cfr_renamed_4787(128);
        if (!this.cfr_renamed_3) {
            if (!this.cfr_renamed_4) {
                Enumeration enumeration;
                Enumeration enumeration2;
                if (this.cfr_renamed_1 instanceof sprxue) {
                    if (this.cfr_renamed_1 instanceof sprnle) {
                        enumeration = enumeration2 = ((sprnle)this.cfr_renamed_1).cfr_renamed_329();
                    } else {
                        sprxue sprxue2 = (sprxue)this.cfr_renamed_1;
                        enumeration = enumeration2 = new sprnle(sprxue2.cfr_renamed_186()).cfr_renamed_329();
                    }
                } else {
                    sprdpe sprdpe2 = this;
                    if (this.cfr_renamed_1 instanceof sprbne) {
                        enumeration = enumeration2 = ((sprbne)sprdpe2.cfr_renamed_1).cfr_renamed_329();
                    } else if (sprdpe2.cfr_renamed_1 instanceof sprere) {
                        enumeration = enumeration2 = ((sprere)this.cfr_renamed_1).cfr_renamed_329();
                    } else {
                        throw new RuntimeException(new StringBuilder().insert(0, sprmfaa.cfr_renamed_9("\u007f\u007fe0x}a|t}t~euu*1")).append(this.cfr_renamed_1.getClass().getName()).toString());
                    }
                }
                while (enumeration.hasMoreElements()) {
                    arg0.cfr_renamed_2149((spra)enumeration2.nextElement());
                    enumeration = enumeration2;
                }
            } else {
                arg0.cfr_renamed_2149(this.cfr_renamed_1);
            }
        }
        arg0.cfr_renamed_4787(0);
        arg0.cfr_renamed_4787(0);
    }

    public sprdpe(int arg0) {
        super(false, arg0, new sprjve());
    }

    public sprdpe(boolean arg0, int arg1, spra arg2) {
        super(arg0, arg1, arg2);
    }

    @Override
    public boolean cfr_renamed_4575() {
        if (!this.cfr_renamed_3) {
            if (this.cfr_renamed_4) {
                return true;
            }
            return this.cfr_renamed_1.cfr_renamed_119().cfr_renamed_4615().cfr_renamed_4575();
        }
        return true;
    }

    @Override
    public int cfr_renamed_4616() throws IOException {
        if (!this.cfr_renamed_3) {
            sprdpe sprdpe2 = this;
            int n = sprdpe2.cfr_renamed_1.cfr_renamed_119().cfr_renamed_4616();
            if (sprdpe2.cfr_renamed_4) {
                return sprcme.cfr_renamed_4585(this.cfr_renamed_2) + sprcme.cfr_renamed_4586(n) + n;
            }
            return sprcme.cfr_renamed_4585(this.cfr_renamed_2) + --n;
        }
        return sprcme.cfr_renamed_4585(this.cfr_renamed_2) + 1;
    }

    public sprdpe(int arg0, spra arg1) {
        super(true, arg0, arg1);
    }
}

