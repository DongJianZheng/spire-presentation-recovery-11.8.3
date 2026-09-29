/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxg;
import com.spire.presentation.packages.sprcxg;
import com.spire.presentation.packages.sprie;
import com.spire.presentation.packages.sprjem;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsjfa;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprwdm;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprwlp;
import com.spire.presentation.packages.sprxam;
import com.spire.presentation.packages.sprxug;
import java.io.InputStream;

public class sprutg
extends sprcxg {
    public sprjem cfr_renamed_4;

    public int cfr_renamed_7819(sprxug arg0) throws sprtqg {
        if (this.cfr_renamed_4.cfr_renamed_3() == 4) {
            sprxug sprxug2 = arg0;
            byte[] byArray = sprxug2.cfr_renamed_7761(this.cfr_renamed_4.cfr_renamed_7757(), this.cfr_renamed_4.cfr_renamed_7738());
            return sprxug2.cfr_renamed_7820(this.cfr_renamed_4.cfr_renamed_7757(), byArray, this.cfr_renamed_4.cfr_renamed_7821())[0];
        }
        if (this.cfr_renamed_4.cfr_renamed_3() == 5) {
            return this.cfr_renamed_4.cfr_renamed_7757();
        }
        return ((sproam)((Object)this.cfr_renamed_4)).cfr_renamed_7783();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public InputStream cfr_renamed_7700(sprie arg0) throws sprtqg {
        try {
            spraxg spraxg2 = arg0.cfr_renamed_7701();
            sprutg sprutg2 = this;
            sprutg2.cfr_renamed_3 = sprutg2.cfr_renamed_7566(arg0, spraxg2);
            return sprutg2.cfr_renamed_3;
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprwlp.cfr_renamed_9("J\fl\u0011\u007f\u0000f\u001baTl\u0006j\u0015{\u001da\u0013/\u0017f\u0004g\u0011}"), exception);
        }
    }

    @Override
    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_3();
    }

    /*
     * WARNING - void declaration
     */
    public sprutg(sprjem sprjem2, sprxam sprxam2) {
        super((sprxam)arg1);
        void arg0;
        void arg1;
        this.cfr_renamed_4 = arg0;
        sprutg.cfr_renamed_7822(this.cfr_renamed_4, sprxam2);
    }

    public spraxg cfr_renamed_7823(sprxug arg0) throws sprtqg {
        byte[] byArray = arg0.cfr_renamed_7761(this.cfr_renamed_4.cfr_renamed_7757(), this.cfr_renamed_4.cfr_renamed_7738());
        int n = this.cfr_renamed_3();
        if (n == 4) {
            byte[] byArray2 = arg0.cfr_renamed_7820(this.cfr_renamed_4.cfr_renamed_7757(), byArray, this.cfr_renamed_4.cfr_renamed_7821());
            int n2 = byArray2[0] & 0xFF;
            byte[] byArray3 = sproze.cfr_renamed_533(byArray2, 1, byArray2.length);
            return new spraxg(n2, byArray3);
        }
        if (n == 5 || n == 6) {
            int n3 = this.cfr_renamed_7819(arg0);
            byte[] byArray4 = arg0.cfr_renamed_7824(this.cfr_renamed_4, byArray);
            return new spraxg(n3, byArray4);
        }
        throw new sprwhm(new StringBuilder().insert(0, sprsjfa.cfr_renamed_9("\u0019*?1<4#68!(d<%//)0l2)6?-#*vd")).append(n).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_7822(sprjem arg0, sprxam arg1) {
        sproam sproam2;
        switch (arg0.cfr_renamed_3()) {
            case 4: {
                if (arg1 instanceof sprwdm) {
                    return;
                }
                if (!(arg1 instanceof sproam)) break;
                sproam sproam3 = (sproam)arg1;
                if (sproam3.cfr_renamed_3() == 1) {
                    return;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprwlp.cfr_renamed_9("\"j\u0006|\u001d`\u001a/@/'D1\\?/\u0017n\u001aa\u001b{T\u007f\u0006j\u0017j\u0010jT\\1F$KT`\u0012/\u0002j\u0006|\u001d`\u001a/")).append(sproam3.cfr_renamed_3()).toString());
            }
            case 5: {
                break;
            }
            case 6: {
                if (!(arg1 instanceof sproam)) {
                    throw new IllegalArgumentException(sprsjfa.cfr_renamed_9("\u001a!>7%+\"dzd\u001f\u000f\t\u0017\u0007d\u0001\u0011\u001f\u0010l&)d*+ (#3) l+\"(5d.=l\u0017\t\r\u001c\u0000l2)6?-#*lv"));
                }
                sproam2 = (sproam)arg1;
                if (sproam2.cfr_renamed_3() == 2) break;
                throw new IllegalArgumentException(sprwlp.cfr_renamed_9("\"j\u0006|\u001d`\u001a/B/'D1\\?/9Z'[Tm\u0011/\u0012`\u0018c\u001bx\u0011kT`\u001ac\r/\u0016vT\\1F$KTy\u0011}\u0007f\u001baT="));
            }
        }
        if (arg1 instanceof sprwdm && arg0.cfr_renamed_3() != 4) {
            throw new IllegalArgumentException(sprsjfa.cfr_renamed_9("\u0012)6?-#*l+*d\u001f\u000f\t\u0017\u0007d<%//)0l4>!/!(-\"#l%l\u0017\t\u0000l4-''!8d/%\"d#* =l&)dxj"));
        }
        if (arg1 instanceof sproam) {
            sproam2 = (sproam)arg1;
            if (arg0.cfr_renamed_3() == 4 && sproam2.cfr_renamed_3() != 1) {
                throw new IllegalArgumentException(sprwlp.cfr_renamed_9("Y\u0011}\u0007f\u001baT;T\\?J'DTl\u0015aT`\u001ac\r/\u0004}\u0011l\u0011k\u0011/\u0002j\u0006|\u001d`\u001a/E/'J=_0!"));
            }
            if (arg0.cfr_renamed_3() == 6 && sproam2.cfr_renamed_3() == 1) {
                throw new IllegalArgumentException(sprsjfa.cfr_renamed_9("\u001a!>7%+\"dzd\u001f\u000f\t\u0017\u0007d<%//)0l\t\u0019\u0017\u0018d\u0002\u000b\u0018d<6)') )d-d\u001aul\u0017\t\r\u001c\u0000l4-''!8j"));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public InputStream cfr_renamed_7825(sprxug arg0) throws sprtqg {
        try {
            sprutg sprutg2 = this;
            spraxg spraxg2 = sprutg2.cfr_renamed_7823(arg0);
            sprutg2.cfr_renamed_3 = sprutg2.cfr_renamed_7566(arg0, spraxg2);
            return sprutg2.cfr_renamed_3;
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprwlp.cfr_renamed_9("J\fl\u0011\u007f\u0000f\u001baTl\u0006j\u0015{\u001da\u0013/\u0017f\u0004g\u0011}"), exception);
        }
    }

    @Override
    public int cfr_renamed_593() {
        return this.cfr_renamed_4.cfr_renamed_7757();
    }
}

