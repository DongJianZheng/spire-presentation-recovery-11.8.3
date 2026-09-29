/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxo;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprgto;
import com.spire.presentation.packages.sprgzo;
import com.spire.presentation.packages.spriro;
import com.spire.presentation.packages.sprivo;
import com.spire.presentation.packages.spriyo;
import com.spire.presentation.packages.sprjdda;
import com.spire.presentation.packages.sprjyo;
import com.spire.presentation.packages.sproyo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtro;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.spruqr;
import com.spire.presentation.packages.spruto;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxip;
import java.util.Iterator;

@sprtea
public class sprswo
extends spriro {
    public static final String cfr_renamed_724 = "hebr";
    public static final String cfr_renamed_953 = "SRB";
    private sprvrx cfr_renamed_133;
    public static final String cfr_renamed_185 = "SND";
    public static final String spr\ufe34 = "guru";
    public static final String cfr_renamed_82 = "URD";
    public static final String cfr_renamed_126 = "ZHP";
    public static final String cfr_renamed_88 = "FAR";
    public static final String cfr_renamed_31 = "latn";
    public static final String cfr_renamed_272 = "armn";
    public static final String cfr_renamed_145 = "LTH";
    public static final String cfr_renamed_114 = "IPPH";
    public static final String cfr_renamed_96 = "ZHS";
    public static final String cfr_renamed_105 = "MLY";
    public static final String cfr_renamed_137 = "default";
    public static final String cfr_renamed_79 = "arab";
    public static final String cfr_renamed_107 = "JAN";
    public static final String cfr_renamed_132 = "cyrl";
    public static final String cfr_renamed_102 = "ZHT";
    public static final String cfr_renamed_93 = "GSUB";
    public static final String cfr_renamed_86 = "BOS";
    public static final String cfr_renamed_152 = "ROM";
    public static final String cfr_renamed_112 = "kana";
    public static final String cfr_renamed_119 = "thai";
    public static final String cfr_renamed_91 = "gujr";
    public static final String cfr_renamed_0 = "KOR";
    public static final String cfr_renamed_1 = "deva";
    public static final String cfr_renamed_2 = "TRK";
    public static final String cfr_renamed_3 = "CHN";
    public static final String cfr_renamed_4 = "hani";

    private /* synthetic */ void cfr_renamed_18853(spruto arg0, sprivo arg1) {
        sprrzo.cfr_renamed_18367(sprjdda.cfr_renamed_9("C\u001a~\u0014|\u0016C\u0006r\u0000d\u001ad\u0006d\u001a\u007f\u001dW\u001fi\u0003x\u00000?{ e\u0011D\u0012r\u001fu'!5}\u0007!"), new Object[0]);
    }

    private /* synthetic */ void cfr_renamed_18854(spriyo arg0, sprivo arg1) {
        int n;
        sprtro[] sprtroArray = arg0.cfr_renamed_18855();
        int n2 = sprtroArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprtro sprtro2 = sprtroArray[n];
            sprswo sprswo2 = this;
            sprswo2.cfr_renamed_18856((sprbxo)sprswo2.cfr_renamed_18857().cfr_renamed_12151(sprtro2.cfr_renamed_4 & 0xFFFF), arg1);
            n3 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int[] cfr_renamed_18858(String string, String string2) {
        void arg1;
        sprjyo sprjyo2;
        void arg0;
        long l = sprrzo.cfr_renamed_18664((String)arg0);
        sprgzo sprgzo2 = this.cfr_renamed_18859().cfr_renamed_18618(l);
        if (sprgzo2 != null && (sprjyo2 = this.cfr_renamed_18860((String)arg1, sprgzo2)) != null) {
            return sprjyo2.cfr_renamed_18861();
        }
        return null;
    }

    @sprtea
    public void cfr_renamed_18862() {
    }

    private /* synthetic */ void cfr_renamed_18856(sprbxo arg0, sprivo arg1) {
        int n;
        sproyo[] sproyoArray = arg0.cfr_renamed_18863();
        int n2 = sproyoArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sproyo sproyo2 = sproyoArray[n];
            this.cfr_renamed_18864(sproyo2, arg1);
            n3 = ++n;
        }
    }

    @sprtea
    public void cfr_renamed_18865() {
    }

    @sprtea
    public void cfr_renamed_18866(String arg0, String arg1, sprivo arg2) {
        if (sprraia.cfr_renamed_12280(arg0) || arg2 == null) {
            return;
        }
        sprdz sprdz2 = this.cfr_renamed_18867(arg0, arg1);
        if (sprdz2 != null && sprdz2.size() > 0) {
            Iterator iterator;
            Iterator iterator2 = iterator = sprdz2.iterator();
            while (iterator2.hasNext()) {
                sprbxo sprbxo2 = (sprbxo)iterator.next();
                iterator2 = iterator;
                this.cfr_renamed_18856(sprbxo2, arg2);
            }
        }
    }

    private /* synthetic */ sprjyo cfr_renamed_18860(String arg0, sprgzo arg1) {
        sprjyo sprjyo2 = arg1.cfr_renamed_18693();
        if (!sprraia.cfr_renamed_12280(arg0) && !cfr_renamed_137.equals(arg0)) {
            int n;
            long l = sprrzo.cfr_renamed_18664(arg0);
            sprjyo[] sprjyoArray = arg1.cfr_renamed_18691();
            int n2 = sprjyoArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                sprjyo sprjyo3 = sprjyoArray[n];
                if (sprjyo3.cfr_renamed_18868() == l) {
                    sprjyo2 = sprjyo3;
                }
                n3 = ++n;
            }
        }
        return sprjyo2;
    }

    @Override
    public void cfr_renamed_18869(sprujo arg0, long arg1) {
        sprrzo.cfr_renamed_18367(spruqr.cfr_renamed_9("6Y$HQl\u0014k\u0005\u007f\u0003oQ|\u0010x\u0018k\u0005c\u001ed\u0002"), new Object[0]);
    }

    private /* synthetic */ void cfr_renamed_18870(sprgto arg0, sprivo arg1) {
        int n = arg0.cfr_renamed_18871().cfr_renamed_18872(arg1.cfr_renamed_13076());
        if (n > -1) {
            arg1.cfr_renamed_18338().cfr_renamed_12819(arg0.cfr_renamed_18873()[n] & 0xFFFF);
        }
    }

    private /* synthetic */ sprdz cfr_renamed_18867(String arg0, String arg1) {
        sprdz sprdz2 = this.cfr_renamed_18874(arg0, arg1);
        if (sprdz2 != null && sprdz2.size() > 0) {
            sprvrx sprvrx2 = new sprvrx();
            Iterator iterator = sprdz2.iterator();
            while (iterator.hasNext()) {
                int n;
                int[] nArray = ((sprxip)iterator.next()).cfr_renamed_18875();
                int n2 = nArray.length;
                int n3 = n = 0;
                while (n3 < n2) {
                    int n4 = nArray[n];
                    sprvrx2.cfr_renamed_12808(this.cfr_renamed_18857().cfr_renamed_12151(n4 & 0xFFFF));
                    n3 = ++n;
                }
            }
            return sprvrx2;
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_18864(sproyo arg0, sprivo arg1) {
        if (arg0 instanceof spruto) {
            this.cfr_renamed_18853((spruto)arg0, arg1);
            return;
        }
        if (arg0 instanceof sprgto) {
            this.cfr_renamed_18870((sprgto)arg0, arg1);
            return;
        }
        if (arg0 instanceof spriyo) {
            this.cfr_renamed_18854((spriyo)arg0, arg1);
        }
    }

    @Override
    public String cfr_renamed_313() {
        return cfr_renamed_93;
    }

    @sprtea
    public void cfr_renamed_18876() {
    }

    private /* synthetic */ sprdz cfr_renamed_18874(String arg0, String arg1) {
        int[] nArray = this.cfr_renamed_18858(arg0, arg1);
        if (nArray != null && nArray.length > 0) {
            int n;
            sprvrx<sprxip> sprvrx2 = new sprvrx<sprxip>();
            int[] nArray2 = nArray;
            int n2 = nArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                int n4 = nArray2[n];
                sprvrx2.cfr_renamed_12808(this.cfr_renamed_18877().cfr_renamed_4[n4 & 0xFFFF]);
                n3 = ++n;
            }
            return sprvrx2;
        }
        return null;
    }

    public sprswo() {
        sprswo sprswo2 = this;
        sprswo2.cfr_renamed_133 = new sprvrx();
    }

    public sprdz cfr_renamed_18857() {
        return this.cfr_renamed_133;
    }

    @Override
    public void cfr_renamed_18878(sprujo arg0, long arg1, int arg2, int arg3, int[] arg4, int arg5) {
        int n;
        sprbxo sprbxo2 = new sprbxo(arg3, arg5);
        sproyo[] sproyoArray = new sproyo[arg4.length];
        sprbxo2.cfr_renamed_18879(sproyoArray);
        int n2 = n = 0;
        while (n2 < arg4.length) {
            sproyo sproyo2 = sprbxo.cfr_renamed_18880(arg2 & 0xFFFF, arg0, arg1 + (long)(arg4[n] & 0xFFFF));
            sproyo2.cfr_renamed_4 = this;
            sproyoArray[n++] = sproyo2;
            n2 = n;
        }
        this.cfr_renamed_18857().cfr_renamed_12808(sprbxo2);
    }
}

