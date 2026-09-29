/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprfzc;
import com.spire.presentation.packages.sprgbd;
import com.spire.presentation.packages.sprkc;
import com.spire.presentation.packages.sprkpa;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnvc;
import com.spire.presentation.packages.sprowc;
import com.spire.presentation.packages.sprpbd;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrbd;
import com.spire.presentation.packages.sprsj;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprwad;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprwyc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzk;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import com.spire.presentation.packages.sprzuc;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public class sprouc
extends sprwad {
    public sprzk cfr_renamed_4 = null;

    /*
     * WARNING - void declaration
     */
    public sprouc(int n, Vector vector, int[] nArray, short[] sArray, short[] sArray2) {
        super((int)arg0, (Vector)arg1, (int[])arg2, (short[])arg3, (short[])arg4);
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
    }

    @Override
    public void spr\u3027(sprsj arg0) throws IOException {
        if (!(arg0 instanceof sprzk)) {
            throw new spryad(80);
        }
        sprsj sprsj2 = arg0;
        this.cfr_renamed_2786(sprsj2.cfr_renamed_2141());
        this.cfr_renamed_4 = (sprzk)sprsj2;
    }

    public sprta cfr_renamed_2790(sprkc arg0, sprzuc arg1, sprgbd arg2) {
        sprta sprta2 = arg0.cfr_renamed_2795(arg1, this.cfr_renamed_91);
        sprta2.cfr_renamed_1197(arg2.cfr_renamed_86, 0, arg2.cfr_renamed_86.length);
        sprta2.cfr_renamed_1197(arg2.cfr_renamed_93, 0, arg2.cfr_renamed_93.length);
        return sprta2;
    }

    @Override
    public void cfr_renamed_2796(sprsj arg0) throws IOException {
        if (arg0 instanceof sprzk) {
            return;
        }
        throw new spryad(80);
    }

    @Override
    public void cfr_renamed_2789(InputStream arg0) throws IOException {
        sprta sprta2;
        sprouc sprouc2 = this;
        sprgbd sprgbd2 = sprouc2.cfr_renamed_2.cfr_renamed_2666();
        sprowc sprowc2 = new sprowc();
        sprkpa sprkpa2 = new sprkpa(arg0, sprowc2);
        sprouc sprouc3 = this;
        sprqid sprqid2 = sprrbd.cfr_renamed_2989((int[])sprouc2.cfr_renamed_4, sprouc3.cfr_renamed_1, sprkpa2);
        byte[] byArray = sprzsc.cfr_renamed_2763(sprkpa2);
        sprpbd sprpbd2 = sprpbd.cfr_renamed_2628(sprouc3.cfr_renamed_2, arg0);
        sprta sprta3 = sprta2 = sprouc2.cfr_renamed_2790(sprouc2.cfr_renamed_119, sprpbd2.cfr_renamed_593(), sprgbd2);
        sprowc2.cfr_renamed_2791(sprta3);
        if (!sprta3.cfr_renamed_1328(sprpbd2.cfr_renamed_79())) {
            throw new spryad(51);
        }
        this.cfr_renamed_112 = sprrbd.cfr_renamed_2985(sprrbd.cfr_renamed_2986(this.cfr_renamed_1, sprqid2, byArray));
    }

    @Override
    public byte[] cfr_renamed_2879() throws IOException {
        sprouc sprouc2;
        sprlc sprlc2;
        sprzuc sprzuc2;
        sprwnd sprwnd2;
        sprqid sprqid2;
        Object object = -1;
        if (this.cfr_renamed_4 == null) {
            object = 23;
        } else {
            int n;
            int n2 = n = 0;
            while (n2 < ((sprzk)this.cfr_renamed_4).length) {
                sprzk sprzk2 = this.cfr_renamed_4[n];
                if (sprnvc.cfr_renamed_2990((int)sprzk2) && sprrbd.cfr_renamed_2991((int)sprzk2)) {
                    object = sprzk2;
                    break;
                }
                n2 = ++n;
            }
        }
        sprqid sprqid3 = null;
        if (object >= 0) {
            sprqid2 = sprqid3 = sprrbd.cfr_renamed_2992(object);
        } else if (sprzra.cfr_renamed_539((int[])this.cfr_renamed_4, 65281)) {
            sprqid2 = sprqid3 = sprrbd.cfr_renamed_2992(23);
        } else {
            if (sprzra.cfr_renamed_539((int[])this.cfr_renamed_4, 65282)) {
                sprqid3 = sprrbd.cfr_renamed_2992(10);
            }
            sprqid2 = sprqid3;
        }
        if (sprqid2 == null) {
            throw new spryad(80);
        }
        sprwnd sprwnd3 = sprrbd.cfr_renamed_2993(this.cfr_renamed_2.cfr_renamed_2794(), sprqid3);
        this.cfr_renamed_0 = (spreed)sprwnd3.cfr_renamed_1225();
        sprwyc sprwyc2 = new sprwyc();
        if (object < 0) {
            sprwnd2 = sprwnd3;
            sprrbd.cfr_renamed_2994(this.cfr_renamed_1, sprqid3, sprwyc2);
        } else {
            sprrbd.cfr_renamed_2995(object, sprwyc2);
            sprwnd2 = sprwnd3;
        }
        sprwmd sprwmd2 = (sprwmd)sprwnd2.cfr_renamed_1224();
        sprouc sprouc3 = this;
        sprrbd.cfr_renamed_2996(sprouc3.cfr_renamed_1, sprwmd2.cfr_renamed_1604(), sprwyc2);
        if (sprzsc.cfr_renamed_2631(sprouc3.cfr_renamed_2)) {
            sprzuc2 = this.cfr_renamed_4.cfr_renamed_2804();
            if (sprzuc2 == null) {
                throw new spryad(80);
            }
            sprlc2 = sprzsc.cfr_renamed_2640(sprzuc2.cfr_renamed_2690());
            sprouc2 = this;
        } else {
            sprzuc2 = null;
            sprlc2 = new sprfzc();
            sprouc2 = this;
        }
        sprgbd sprgbd2 = sprouc2.cfr_renamed_2.cfr_renamed_2666();
        sprlc2.cfr_renamed_1197(sprgbd2.cfr_renamed_86, 0, sprgbd2.cfr_renamed_86.length);
        sprlc2.cfr_renamed_1197(sprgbd2.cfr_renamed_93, 0, sprgbd2.cfr_renamed_93.length);
        sprlc sprlc3 = sprlc2;
        sprwyc sprwyc3 = sprwyc2;
        sprwyc3.cfr_renamed_2997(sprlc2);
        byte[] byArray = new byte[sprlc3.cfr_renamed_1218()];
        sprlc3.cfr_renamed_1219(byArray, 0);
        byte[] byArray2 = this.cfr_renamed_4.cfr_renamed_2805(byArray);
        new sprpbd(sprzuc2, byArray2).cfr_renamed_2623(sprwyc2);
        return sprwyc3.toByteArray();
    }

    @Override
    public void cfr_renamed_2803(sprfrc arg0) throws IOException {
        int n;
        short[] sArray = arg0.cfr_renamed_2896();
        int n2 = n = 0;
        while (n2 < sArray.length) {
            switch (sArray[n]) {
                case 1: 
                case 2: 
                case 64: {
                    break;
                }
                default: {
                    throw new spryad(47);
                }
            }
            n2 = ++n;
        }
    }
}

