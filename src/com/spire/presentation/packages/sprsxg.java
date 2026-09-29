/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxl;
import com.spire.presentation.packages.sprcjm;
import com.spire.presentation.packages.sprhjm;
import com.spire.presentation.packages.sprhzg;
import com.spire.presentation.packages.spriql;
import com.spire.presentation.packages.spriyg;
import com.spire.presentation.packages.sprjam;
import com.spire.presentation.packages.sprjim;
import com.spire.presentation.packages.sprkcm;
import com.spire.presentation.packages.sprkgm;
import com.spire.presentation.packages.sprmpl;
import com.spire.presentation.packages.sprozl;
import com.spire.presentation.packages.sprphm;
import com.spire.presentation.packages.sprpnl;
import com.spire.presentation.packages.sprpzl;
import com.spire.presentation.packages.sprrun;
import com.spire.presentation.packages.sprscm;
import com.spire.presentation.packages.sprsyl;
import com.spire.presentation.packages.sprszl;
import com.spire.presentation.packages.sprtxl;
import com.spire.presentation.packages.sprusl;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprvyl;
import com.spire.presentation.packages.sprxtl;
import com.spire.presentation.packages.sprxyl;
import com.spire.presentation.packages.sprzok;
import com.spire.presentation.packages.sprzyg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sprsxg {
    public List cfr_renamed_4;

    public void cfr_renamed_7627(boolean arg0, byte[] arg1) {
        if (arg1 == null) {
            throw new IllegalArgumentException(sprzok.cfr_renamed_9("tuadxqa!an5rpu5o`my!Fhrops@rps\\E"));
        }
        this.cfr_renamed_4.add(new sprbxl(arg0, false, arg1));
    }

    public void cfr_renamed_7628(boolean arg0, int[] arg1) {
        this.cfr_renamed_4.add(new sprscm(11, arg0, arg1));
    }

    public sprpnl[] cfr_renamed_7602(int arg0) {
        int n;
        ArrayList arrayList = new ArrayList();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            if (((sprpnl)this.cfr_renamed_4.get(n)).cfr_renamed_324() == arg0) {
                arrayList.add(this.cfr_renamed_4.get(n));
            }
            n2 = ++n;
        }
        return arrayList.toArray(new sprpnl[0]);
    }

    public void cfr_renamed_7629(boolean arg0, int arg1) {
        this.cfr_renamed_4.add(new sprkgm(arg0, arg1));
    }

    public void cfr_renamed_7630(boolean arg0, String arg1) {
        this.cfr_renamed_4.add(new sprszl(arg0, arg1));
    }

    public void cfr_renamed_7631(boolean arg0, int[] arg1) {
        this.cfr_renamed_4.add(new sprscm(39, arg0, arg1));
    }

    public void cfr_renamed_7632(boolean arg0, boolean arg1) {
        this.cfr_renamed_4.add(new sprhjm(arg0, arg1));
    }

    public void cfr_renamed_7633(boolean arg0, int arg1, int arg2) {
        this.cfr_renamed_4.add(new spriql(arg0, arg1, arg2));
    }

    public void cfr_renamed_7634(boolean arg0, long arg1) {
        this.cfr_renamed_4.add(new sprphm(arg0, arg1));
    }

    public void cfr_renamed_7635(boolean arg0, int[] arg1) {
        this.cfr_renamed_4.add(new sprscm(22, arg0, arg1));
    }

    public void cfr_renamed_7636(boolean arg0, int arg1, int arg2, byte[] arg3) {
        this.cfr_renamed_4.add(new sprxtl(arg0, arg1, arg2, arg3));
    }

    public void cfr_renamed_7637(boolean arg0, sprvbh arg1) {
        this.cfr_renamed_4.add(new sprjim(arg0, arg1.cfr_renamed_3(), arg1.cfr_renamed_5209()));
    }

    public void cfr_renamed_7638(boolean arg0, sprvbh arg1) {
        this.cfr_renamed_7637(arg0, arg1);
    }

    public void cfr_renamed_7639(boolean arg0, Date arg1) {
        this.cfr_renamed_4.add(new sprmpl(arg0, arg1));
    }

    public void cfr_renamed_7640(boolean arg0, String arg1) {
        this.cfr_renamed_7641(arg0, arg1);
    }

    public void cfr_renamed_7642(boolean arg0, boolean arg1, String arg2, String arg3) {
        this.cfr_renamed_4.add(new sprpzl(arg0, arg1, arg2, arg3));
    }

    public void cfr_renamed_7643(boolean arg0, sprvbh arg1) {
        this.cfr_renamed_4.add(new sprozl(arg0, arg1.cfr_renamed_3(), arg1.cfr_renamed_5209()));
    }

    public void cfr_renamed_7644(sprpnl arg0) {
        this.cfr_renamed_4.add(arg0);
    }

    public boolean cfr_renamed_7645(sprpnl arg0) {
        return this.cfr_renamed_4.remove(arg0);
    }

    public void cfr_renamed_7646(boolean arg0, sprzyg arg1) throws IOException {
        this.cfr_renamed_7647(arg0, arg1);
    }

    public void cfr_renamed_7648(boolean arg0, boolean arg1) {
        this.cfr_renamed_4.add(new sprkcm(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprsxg(sprhzg sprhzg2) {
        sprsxg sprsxg2 = this;
        sprsxg2.cfr_renamed_4 = new ArrayList();
        if (sprhzg2 != null) {
            void arg0;
            int n;
            int n2 = n = 0;
            while (n2 != arg0.cfr_renamed_4.length) {
                this.cfr_renamed_4.add(arg0.cfr_renamed_4[n++]);
                n2 = n;
            }
        }
    }

    public void cfr_renamed_7649(boolean arg0, spriyg arg1) {
        this.cfr_renamed_7643(arg0, arg1.cfr_renamed_1157());
    }

    public void cfr_renamed_7650(boolean arg0, int arg1, byte[] arg2) {
        this.cfr_renamed_4.add(new sprsyl(arg0, -128, arg1, arg2));
    }

    public void cfr_renamed_7651(boolean arg0, byte arg1) {
        this.cfr_renamed_4.add(new sprcjm(arg0, arg1));
    }

    public void cfr_renamed_7647(boolean arg0, sprzyg arg1) throws IOException {
        byte[] byArray;
        byte[] byArray2;
        byte[] byArray3 = arg1.cfr_renamed_91();
        if (byArray3.length - 1 > 256) {
            byArray2 = new byte[byArray3.length - 3];
            byArray = byArray3;
        } else {
            byArray2 = new byte[byArray3.length - 2];
            byArray = byArray3;
        }
        System.arraycopy(byArray, byArray3.length - byArray2.length, byArray2, 0, byArray2.length);
        this.cfr_renamed_4.add(new sprjam(arg0, false, byArray2));
    }

    public void cfr_renamed_7652(boolean arg0, boolean arg1, String arg2, String arg3) {
        this.cfr_renamed_7642(arg0, arg1, arg2, arg3);
    }

    public void cfr_renamed_7653(boolean arg0, int arg1, byte[] arg2) {
        this.cfr_renamed_7650(arg0, arg1, arg2);
    }

    public void cfr_renamed_7654(boolean arg0, boolean arg1) {
        this.cfr_renamed_4.add(new sprvyl(arg0, arg1));
    }

    public void cfr_renamed_7655(boolean arg0, long arg1) {
        this.cfr_renamed_4.add(new sprusl(arg0, arg1));
    }

    public void cfr_renamed_7656(boolean arg0, byte[] arg1) {
        this.cfr_renamed_7627(arg0, arg1);
    }

    public void cfr_renamed_7657(boolean arg0, int[] arg1) {
        this.cfr_renamed_4.add(new sprscm(21, arg0, arg1));
    }

    public void cfr_renamed_7658(boolean arg0, long arg1) {
        this.cfr_renamed_4.add(new sprxyl(arg0, arg1));
    }

    public sprhzg cfr_renamed_31() {
        sprsxg sprsxg2 = this;
        return new sprhzg(sprsxg2.cfr_renamed_4.toArray(new sprpnl[sprsxg2.cfr_renamed_4.size()]));
    }

    public boolean cfr_renamed_7596(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            if (((sprpnl)this.cfr_renamed_4.get(n)).cfr_renamed_324() == arg0) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public void cfr_renamed_7641(boolean arg0, String arg1) {
        if (arg1 == null) {
            throw new IllegalArgumentException(sprrun.cfr_renamed_9("\\FIWPBI\u0012I]\u001dAXF\u001d\\H^Q\u0012n[Z\\X@hAX@tv"));
        }
        this.cfr_renamed_4.add(new sprbxl(arg0, arg1));
    }

    public sprsxg() {
        sprsxg sprsxg2 = this;
        sprsxg2.cfr_renamed_4 = new ArrayList();
    }

    public void cfr_renamed_7659(boolean arg0, byte arg1, String arg2) {
        this.cfr_renamed_4.add(new sprtxl(arg0, arg1, arg2));
    }
}

