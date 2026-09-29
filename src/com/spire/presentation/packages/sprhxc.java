/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctc;
import com.spire.presentation.packages.sprfzc;
import com.spire.presentation.packages.sprgbd;
import com.spire.presentation.packages.sprgwc;
import com.spire.presentation.packages.sprkc;
import com.spire.presentation.packages.sprkpa;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprowc;
import com.spire.presentation.packages.sprpbd;
import com.spire.presentation.packages.sprsj;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprtyc;
import com.spire.presentation.packages.sprwyc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzk;
import com.spire.presentation.packages.sprzmd;
import com.spire.presentation.packages.sprzsc;
import com.spire.presentation.packages.sprzuc;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public class sprhxc
extends sprtyc {
    public sprzk cfr_renamed_4 = null;

    /*
     * WARNING - void declaration
     */
    public sprhxc(int n, Vector vector, sprzmd sprzmd2) {
        super((int)arg0, (Vector)arg1, (sprzmd)arg2);
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
        sprta sprta2 = arg0.cfr_renamed_2795(arg1, this.cfr_renamed_119);
        sprta2.cfr_renamed_1197(arg2.cfr_renamed_86, 0, arg2.cfr_renamed_86.length);
        sprta2.cfr_renamed_1197(arg2.cfr_renamed_93, 0, arg2.cfr_renamed_93.length);
        return sprta2;
    }

    @Override
    public void cfr_renamed_2789(InputStream arg0) throws IOException {
        sprta sprta2;
        sprhxc sprhxc2 = this;
        sprgbd sprgbd2 = sprhxc2.cfr_renamed_2.cfr_renamed_2666();
        sprowc sprowc2 = new sprowc();
        sprctc sprctc2 = sprctc.cfr_renamed_2661(new sprkpa(arg0, sprowc2));
        sprpbd sprpbd2 = sprpbd.cfr_renamed_2628(sprhxc2.cfr_renamed_2, arg0);
        sprta sprta3 = sprta2 = sprhxc2.cfr_renamed_2790(sprhxc2.cfr_renamed_2, sprpbd2.cfr_renamed_593(), sprgbd2);
        sprowc2.cfr_renamed_2791(sprta3);
        if (!sprta3.cfr_renamed_1328(sprpbd2.cfr_renamed_79())) {
            throw new spryad(51);
        }
        this.cfr_renamed_86 = sprgwc.cfr_renamed_2899(sprctc2.cfr_renamed_1157());
    }

    @Override
    public byte[] cfr_renamed_2879() throws IOException {
        sprhxc sprhxc2;
        sprlc sprlc2;
        sprzuc sprzuc2;
        if (this.cfr_renamed_91 == null) {
            throw new spryad(80);
        }
        sprwyc sprwyc2 = new sprwyc();
        sprhxc sprhxc3 = this;
        this.cfr_renamed_4 = sprgwc.cfr_renamed_2903(this.cfr_renamed_2.cfr_renamed_2794(), sprhxc3.cfr_renamed_91, sprwyc2);
        if (sprzsc.cfr_renamed_2631(sprhxc3.cfr_renamed_2)) {
            sprzuc2 = this.cfr_renamed_4.cfr_renamed_2804();
            if (sprzuc2 == null) {
                throw new spryad(80);
            }
            sprlc2 = sprzsc.cfr_renamed_2640(sprzuc2.cfr_renamed_2690());
            sprhxc2 = this;
        } else {
            sprzuc2 = null;
            sprlc2 = new sprfzc();
            sprhxc2 = this;
        }
        sprgbd sprgbd2 = sprhxc2.cfr_renamed_2.cfr_renamed_2666();
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
}

