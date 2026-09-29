/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrp;
import com.spire.presentation.packages.sprbxl;
import com.spire.presentation.packages.sprcjm;
import com.spire.presentation.packages.sprhjm;
import com.spire.presentation.packages.spriql;
import com.spire.presentation.packages.sprjim;
import com.spire.presentation.packages.sprkcm;
import com.spire.presentation.packages.sprkgm;
import com.spire.presentation.packages.sprmpl;
import com.spire.presentation.packages.sprozl;
import com.spire.presentation.packages.sprphm;
import com.spire.presentation.packages.sprpnl;
import com.spire.presentation.packages.sprpzl;
import com.spire.presentation.packages.sprsam;
import com.spire.presentation.packages.sprscm;
import com.spire.presentation.packages.sprsyl;
import com.spire.presentation.packages.sprszl;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtvg;
import com.spire.presentation.packages.sprtxl;
import com.spire.presentation.packages.sprusl;
import com.spire.presentation.packages.sprvyl;
import com.spire.presentation.packages.sprxcm;
import com.spire.presentation.packages.sprxtl;
import com.spire.presentation.packages.sprxyl;
import com.spire.presentation.packages.sprzyg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class sprhzg {
    public sprpnl[] cfr_renamed_4;

    public sprszl cfr_renamed_7591() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(26);
        if (sprpnl2 == null) {
            return null;
        }
        return new sprszl(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
    }

    public long cfr_renamed_7593() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(16);
        if (sprpnl2 == null) {
            return 0L;
        }
        return ((sprxyl)sprpnl2).cfr_renamed_7541();
    }

    public int[] cfr_renamed_7594() {
        int n;
        int n2;
        int n3 = 0;
        int n4 = n2 = 0;
        while (n4 != this.cfr_renamed_4.length) {
            if (this.cfr_renamed_4[n2].cfr_renamed_101()) {
                ++n3;
            }
            n4 = ++n2;
        }
        int[] nArray = new int[n3];
        n3 = 0;
        int n5 = n = 0;
        while (n5 != this.cfr_renamed_4.length) {
            if (this.cfr_renamed_4[n].cfr_renamed_101()) {
                nArray[n3++] = this.cfr_renamed_4[n].cfr_renamed_324();
            }
            n5 = ++n;
        }
        return nArray;
    }

    public boolean cfr_renamed_7595() {
        sprkcm sprkcm2 = (sprkcm)this.cfr_renamed_7564(25);
        if (sprkcm2 != null) {
            return sprkcm2.cfr_renamed_7595();
        }
        return false;
    }

    public boolean cfr_renamed_7596(int arg0) {
        return this.cfr_renamed_7564(arg0) != null;
    }

    public sprcjm cfr_renamed_7597() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(30);
        if (sprpnl2 == null) {
            return null;
        }
        return new sprcjm(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
    }

    public int[] cfr_renamed_7598() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(21);
        if (sprpnl2 == null) {
            return null;
        }
        return ((sprscm)sprpnl2).cfr_renamed_7599();
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.length;
    }

    public long cfr_renamed_7600() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(3);
        if (sprpnl2 == null) {
            return 0L;
        }
        return ((sprusl)sprpnl2).cfr_renamed_2147();
    }

    public sprszl[] cfr_renamed_7601() {
        int n;
        sprpnl[] sprpnlArray = this.cfr_renamed_7602(26);
        sprszl[] sprszlArray = new sprszl[sprpnlArray.length];
        int n2 = n = 0;
        while (n2 < sprpnlArray.length) {
            sprpnl sprpnl2 = sprpnlArray[n];
            sprszlArray[n++] = new sprszl(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
            n2 = n;
        }
        return sprszlArray;
    }

    public sprjim[] cfr_renamed_7603() {
        int n;
        sprpnl[] sprpnlArray = this.cfr_renamed_7602(35);
        sprjim[] sprjimArray = new sprjim[sprpnlArray.length];
        int n2 = n = 0;
        while (n2 < sprjimArray.length) {
            int n3 = n;
            sprjim sprjim2 = new sprjim(sprpnlArray[n].cfr_renamed_101(), sprpnlArray[n].cfr_renamed_7592(), sprpnlArray[n].cfr_renamed_2609());
            sprjimArray[n3] = sprjim2;
            n2 = ++n;
        }
        return sprjimArray;
    }

    public Date cfr_renamed_7604() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(2);
        if (sprpnl2 == null) {
            return null;
        }
        return ((sprmpl)sprpnl2).cfr_renamed_2147();
    }

    public static sprhzg cfr_renamed_7605(sprpnl[] arg0) {
        if (arg0 == null) {
            arg0 = new sprpnl[]{};
        }
        return new sprhzg(arg0);
    }

    public sprsam[] cfr_renamed_7606() {
        int n;
        sprpnl[] sprpnlArray = this.cfr_renamed_7602(6);
        sprsam[] sprsamArray = new sprsam[sprpnlArray.length];
        int n2 = n = 0;
        while (n2 < sprsamArray.length) {
            sprpnl sprpnl2 = sprpnlArray[n];
            sprsamArray[n++] = new sprsam(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
            n2 = n;
        }
        return sprsamArray;
    }

    public sprsam cfr_renamed_7607() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(6);
        if (sprpnl2 == null) {
            return null;
        }
        return new sprsam(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
    }

    public int[] cfr_renamed_7608() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(39);
        if (sprpnl2 == null) {
            return null;
        }
        return ((sprscm)sprpnl2).cfr_renamed_7599();
    }

    public sprhzg(sprpnl[] sprpnlArray) {
        this.cfr_renamed_4 = sprpnlArray;
    }

    public spriql cfr_renamed_7609() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(5);
        if (sprpnl2 == null) {
            return null;
        }
        return new spriql(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
    }

    public sprpnl[] cfr_renamed_7602(int arg0) {
        int n;
        ArrayList<sprpnl> arrayList = new ArrayList<sprpnl>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            if (this.cfr_renamed_4[n].cfr_renamed_324() == arg0) {
                arrayList.add(this.cfr_renamed_4[n]);
            }
            n2 = ++n;
        }
        return arrayList.toArray(new sprpnl[0]);
    }

    public int[] cfr_renamed_7610() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(11);
        if (sprpnl2 == null) {
            return null;
        }
        return ((sprscm)sprpnl2).cfr_renamed_7599();
    }

    public sprxtl cfr_renamed_7611() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(31);
        if (sprpnl2 == null) {
            return null;
        }
        return new sprxtl(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
    }

    public sprpzl[] cfr_renamed_7612() {
        int n;
        sprpnl[] sprpnlArray = this.cfr_renamed_7602(20);
        sprpzl[] sprpzlArray = new sprpzl[sprpnlArray.length];
        int n2 = n = 0;
        while (n2 < sprpnlArray.length) {
            int n3 = n++;
            sprpzlArray[n3] = (sprpzl)sprpnlArray[n3];
            n2 = n;
        }
        return sprpzlArray;
    }

    public sprhjm cfr_renamed_7613() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(7);
        if (sprpnl2 == null) {
            return null;
        }
        return new sprhjm(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
    }

    public String cfr_renamed_7614() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(28);
        if (sprpnl2 == null) {
            return null;
        }
        return ((sprbxl)sprpnl2).cfr_renamed_6005();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtvg cfr_renamed_7551() throws sprtqg {
        int n;
        sprpnl[] sprpnlArray = this.cfr_renamed_7602(32);
        ArrayList<sprzyg> arrayList = new ArrayList<sprzyg>();
        int n2 = n = 0;
        while (true) {
            if (n2 >= sprpnlArray.length) {
                ArrayList<sprzyg> arrayList2 = arrayList;
                return new sprtvg(arrayList2.toArray(new sprzyg[arrayList2.size()]));
            }
            try {
                arrayList.add(new sprzyg(sprxcm.cfr_renamed_184(sprpnlArray[n].cfr_renamed_2609())));
            }
            catch (IOException iOException) {
                throw new sprtqg(new StringBuilder().insert(0, sprbrp.cfr_renamed_9("iD]HPO\u001c^S\nLKNYY\nOC[D]^IXY\nLK_AY^\u0006\n")).append(iOException.getMessage()).toString(), iOException);
            }
            n2 = ++n;
        }
    }

    public sprpnl[] cfr_renamed_7563() {
        return this.cfr_renamed_4;
    }

    public sprtxl cfr_renamed_4273() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(29);
        if (sprpnl2 == null) {
            return null;
        }
        return new sprtxl(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
    }

    public sprpnl cfr_renamed_7564(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            if (this.cfr_renamed_4[n].cfr_renamed_324() == arg0) {
                return this.cfr_renamed_4[n];
            }
            n2 = ++n;
        }
        return null;
    }

    public boolean cfr_renamed_7615() {
        sprvyl sprvyl2 = this.cfr_renamed_7616();
        return sprvyl2 == null || sprvyl2.cfr_renamed_7615();
    }

    public int cfr_renamed_7617() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(27);
        if (sprpnl2 == null) {
            return 0;
        }
        return ((sprkgm)sprpnl2).cfr_renamed_4690();
    }

    public sprpzl[] cfr_renamed_7618() {
        return this.cfr_renamed_7612();
    }

    public sprozl cfr_renamed_7619() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(33);
        if (sprpnl2 == null) {
            return null;
        }
        return new sprozl(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
    }

    public long cfr_renamed_7620() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(9);
        if (sprpnl2 == null) {
            return 0L;
        }
        return ((sprphm)sprpnl2).cfr_renamed_2147();
    }

    public sprvyl cfr_renamed_7616() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(4);
        if (sprpnl2 == null) {
            return null;
        }
        return new sprvyl(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
    }

    public sprsyl[] cfr_renamed_7621() {
        int n;
        sprpnl[] sprpnlArray = this.cfr_renamed_7602(12);
        sprsyl[] sprsylArray = new sprsyl[sprpnlArray.length];
        int n2 = n = 0;
        while (n2 < sprsylArray.length) {
            int n3 = n;
            sprsyl sprsyl2 = new sprsyl(sprpnlArray[n].cfr_renamed_101(), sprpnlArray[n].cfr_renamed_7592(), sprpnlArray[n].cfr_renamed_2609());
            sprsylArray[n3] = sprsyl2;
            n2 = ++n;
        }
        return sprsylArray;
    }

    public sprpnl[] cfr_renamed_4529() {
        sprpnl[] sprpnlArray = new sprpnl[this.cfr_renamed_4.length];
        System.arraycopy(this.cfr_renamed_4, 0, sprpnlArray, 0, sprpnlArray.length);
        return sprpnlArray;
    }

    public boolean cfr_renamed_7622() {
        sprhjm sprhjm2 = this.cfr_renamed_7613();
        return sprhjm2 == null || sprhjm2.cfr_renamed_7622();
    }

    public sprjim cfr_renamed_7623() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(35);
        if (sprpnl2 == null) {
            return null;
        }
        return new sprjim(sprpnl2.cfr_renamed_101(), sprpnl2.cfr_renamed_7592(), sprpnl2.cfr_renamed_2609());
    }

    public int[] cfr_renamed_7624() {
        sprpnl sprpnl2 = this.cfr_renamed_7564(22);
        if (sprpnl2 == null) {
            return null;
        }
        return ((sprscm)sprpnl2).cfr_renamed_7599();
    }

    public sprpzl[] cfr_renamed_7625(String arg0) {
        int n;
        sprpzl[] sprpzlArray = this.cfr_renamed_7612();
        ArrayList<sprpzl> arrayList = new ArrayList<sprpzl>();
        int n2 = n = 0;
        while (n2 != sprpzlArray.length) {
            sprpzl sprpzl2 = sprpzlArray[n];
            if (sprpzl2.cfr_renamed_7626().equals(arg0)) {
                arrayList.add(sprpzl2);
            }
            n2 = ++n;
        }
        return arrayList.toArray(new sprpzl[0]);
    }
}

