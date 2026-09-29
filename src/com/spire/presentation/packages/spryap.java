/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprivo;
import com.spire.presentation.packages.sprjqo;
import com.spire.presentation.packages.sprkqo;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprprc;
import com.spire.presentation.packages.sprpyo;
import com.spire.presentation.packages.sprqzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprsqo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvo;
import com.spire.presentation.packages.spruxo;
import com.spire.presentation.packages.spruyo;
import com.spire.presentation.packages.sprwpo;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxqo;
import com.spire.presentation.packages.spryro;
import com.spire.presentation.packages.sprysb;
import com.spire.presentation.packages.sprzwo;

@sprtea
public abstract class spryap
extends sprkqo {
    @sprtea
    public static final int cfr_renamed_105 = 0;
    public sprdsp cfr_renamed_137;
    public static final int cfr_renamed_79 = 4;
    @sprtea
    public static final int cfr_renamed_107 = 1;
    @sprtea
    public static final int cfr_renamed_132 = 0;
    @sprtea
    public static final int cfr_renamed_102 = 1;
    @sprtea
    public static final int cfr_renamed_93 = 3;
    @sprtea
    public static final int cfr_renamed_86 = 1;
    @sprtea
    public static final int cfr_renamed_152 = 2;
    @sprtea
    public static final int cfr_renamed_112 = 1033;
    @sprtea
    public static final int cfr_renamed_119 = 3;
    @sprtea
    public static final int cfr_renamed_91 = 25;
    @sprtea
    public static final int cfr_renamed_0 = 0;
    public static final int cfr_renamed_1 = 12;
    public int cfr_renamed_2;
    @sprtea
    public static final int cfr_renamed_3 = 10;
    @sprtea
    public static final int cfr_renamed_4 = 0;

    public abstract boolean cfr_renamed_18404();

    private static /* synthetic */ spruxo cfr_renamed_18636(spruxo[] arg0, int arg1, int arg2) {
        int n;
        spruxo[] spruxoArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            spruxo spruxo2 = spruxoArray[n];
            if (spruxo2.cfr_renamed_18634() == arg1 && spruxo2.cfr_renamed_7832() == arg2) {
                return spruxo2;
            }
            n3 = ++n;
        }
        return null;
    }

    @sprtea
    public static spruxo[] cfr_renamed_18637(sprmzo arg0) {
        if ((arg0.cfr_renamed_13218() & 0xFFFF) != 0) {
            throw new IllegalStateException(sprysb.cfr_renamed_9(" ,\u0010:\u0005'\u00166\u0010&U!\u0018#\u0005b\u0001#\u0017.\u0010b\u0003'\u00071\u001c-\u001bl"));
        }
        sprmzo sprmzo2 = arg0;
        return spryap.cfr_renamed_18638(sprmzo2, sprmzo2.cfr_renamed_13218() & 0xFFFF);
    }

    @Override
    @sprtea
    public void cfr_renamed_18252(sprruo arg0) {
        int n;
        int n2;
        sprwpo[] sprwpoArray = this.cfr_renamed_18627();
        sprwvn sprwvn2 = new sprwvn();
        int n3 = n2 = 0;
        while (n3 < sprwpoArray.length) {
            sprovja.cfr_renamed_11658(sprwvn2, sprwpoArray[n2++].cfr_renamed_18480());
            n3 = n2;
        }
        arg0.cfr_renamed_14639(0);
        arg0.cfr_renamed_14639(sprwpoArray.length);
        n2 = 4 + 8 * sprwpoArray.length;
        int n4 = n = 0;
        while (n4 < sprwpoArray.length) {
            int n5 = n2;
            sprruo sprruo2 = arg0;
            sprruo2.cfr_renamed_14639(sprwpoArray[n].cfr_renamed_18634());
            sprruo2.cfr_renamed_14639(sprwpoArray[n].cfr_renamed_18635());
            arg0.cfr_renamed_15097(n5);
            n2 = n5 + ((byte[])sprwvn2.get(++n)).length;
            n4 = n;
        }
        int n6 = n = 0;
        while (n6 < sprwpoArray.length) {
            Object object = sprwvn2.get(n);
            arg0.cfr_renamed_9854((byte[])object);
            n6 = ++n;
        }
    }

    private static /* synthetic */ spryap cfr_renamed_18639(sprmzo arg0, spruxo[] arg1) {
        spruxo spruxo2 = spryap.cfr_renamed_18640(arg1, 3, 10, 12);
        if (spruxo2 != null) {
            sprjqo sprjqo2 = sprjqo.cfr_renamed_18632(arg0, spruxo2);
            return new sprtvo(sprjqo2.cfr_renamed_18631(), sprjqo2.cfr_renamed_13895());
        }
        spruxo2 = spryap.cfr_renamed_18640(arg1, 3, 0, 4);
        if (spruxo2 != null) {
            spruyo spruyo2 = spruyo.cfr_renamed_18632(arg0, spruxo2);
            return new sprpyo(spruyo2.cfr_renamed_18631(), spruyo2.cfr_renamed_13895(), spruxo2.cfr_renamed_18634(), spruxo2.cfr_renamed_18635());
        }
        spruxo2 = spryap.cfr_renamed_18640(arg1, 3, 1, 4);
        if (spruxo2 != null) {
            spruyo spruyo3 = spruyo.cfr_renamed_18632(arg0, spruxo2);
            return new sprpyo(spruyo3.cfr_renamed_18631(), spruyo3.cfr_renamed_13895(), spruxo2.cfr_renamed_18634(), spruxo2.cfr_renamed_18635());
        }
        spruxo2 = spryap.cfr_renamed_18636(arg1, 0, 4);
        if (spruxo2 != null) {
            spruyo spruyo4 = spruyo.cfr_renamed_18632(arg0, spruxo2);
            return new sprpyo(spruyo4.cfr_renamed_18631(), spruyo4.cfr_renamed_13895(), spruxo2.cfr_renamed_18634(), spruxo2.cfr_renamed_18635());
        }
        throw new IllegalStateException(sprprc.cfr_renamed_9("Gtj{ka$sm{`5e5vpu`mgaq$vitt5a{gz`|jr$gavkg`;"));
    }

    private static /* synthetic */ spruxo cfr_renamed_18640(spruxo[] arg0, int arg1, int arg2, int arg3) {
        int n;
        spruxo[] spruxoArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            spruxo spruxo2 = spruxoArray[n];
            if (spruxo2.cfr_renamed_18634() == arg1 && spruxo2.cfr_renamed_18635() == arg2 && spruxo2.cfr_renamed_7832() == arg3) {
                return spruxo2;
            }
            n3 = ++n;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spryap(sprdsp sprdsp2, int n) {
        void arg0;
        spryap spryap2 = this;
        spryap2.cfr_renamed_137 = arg0;
        spryap2.cfr_renamed_2 = n;
    }

    public void cfr_renamed_18454(sprdsp arg0) {
        this.cfr_renamed_137 = arg0;
    }

    public sprzwo cfr_renamed_18412(spryro arg0, sprxqo arg1, int arg2) {
        int n;
        sprzwo sprzwo2 = new sprzwo();
        int n2 = n = 0;
        while (n2 < arg2) {
            sprzwo sprzwo3;
            sprivo sprivo2;
            sprsqo sprsqo2 = arg0.cfr_renamed_18579(n);
            if (arg1 != null) {
                sprqzo sprqzo2 = arg1.cfr_renamed_18253(n);
                sprsqo sprsqo3 = sprsqo2;
                sprqzo sprqzo3 = sprqzo2;
                sprivo2 = new sprivo(n, sprsqo3.cfr_renamed_3, sprsqo3.cfr_renamed_4, sprqzo3.cfr_renamed_3, sprqzo3.cfr_renamed_4);
                sprzwo3 = sprzwo2;
            } else {
                sprsqo sprsqo4 = sprsqo2;
                sprsqo sprsqo5 = sprsqo2;
                sprivo2 = new sprivo(n, sprsqo4.cfr_renamed_3, sprsqo4.cfr_renamed_4, sprsqo5.cfr_renamed_3, sprsqo5.cfr_renamed_4);
                sprzwo3 = sprzwo2;
            }
            sprzwo3.cfr_renamed_18335(sprivo2);
            n2 = ++n;
        }
        sprzwo sprzwo4 = sprzwo2;
        sprzwo4.cfr_renamed_18329(sprzwo4.cfr_renamed_18331(0));
        sprzwo2.cfr_renamed_825(65535, 0);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_137.cfr_renamed_11861()) {
            spryap spryap2 = this;
            int n4 = spryap2.cfr_renamed_137.cfr_renamed_7861(n);
            int n5 = (Integer)spryap2.cfr_renamed_137.cfr_renamed_13485(n);
            sprzwo2.cfr_renamed_825(n4, n5);
            n3 = ++n;
        }
        return sprzwo2;
    }

    public abstract sprwpo[] cfr_renamed_18627();

    private static /* synthetic */ spruxo[] cfr_renamed_18638(sprmzo arg0, int arg1) {
        int n;
        long l = arg0.cfr_renamed_14060().cfr_renamed_3274() - 4L;
        spruxo[] spruxoArray = new spruxo[arg1];
        int n2 = n = 0;
        while (n2 < arg1) {
            sprmzo sprmzo2 = arg0;
            int n3 = sprmzo2.cfr_renamed_13218() & 0xFFFF;
            int n4 = sprmzo2.cfr_renamed_13218() & 0xFFFF;
            int n5 = sprmzo2.cfr_renamed_12261();
            long l2 = sprmzo2.cfr_renamed_14060().cfr_renamed_3274();
            long l3 = l + (long)n5;
            sprmzo2.cfr_renamed_14060().cfr_renamed_11548(l3);
            int n6 = sprmzo2.cfr_renamed_13218() & 0xFFFF;
            sprmzo2.cfr_renamed_14060().cfr_renamed_11548(l2);
            spruxoArray[n++] = new spruxo(n3, n4, n6, l3);
            n2 = n;
        }
        return spruxoArray;
    }

    public int[] cfr_renamed_18641() {
        return this.cfr_renamed_137.cfr_renamed_6507();
    }

    public boolean cfr_renamed_18642(int arg0) {
        return this.cfr_renamed_137.cfr_renamed_14000(arg0);
    }

    public static spryap cfr_renamed_15088(sprmzo arg0) {
        if ((arg0.cfr_renamed_13218() & 0xFFFF) != 0) {
            throw new IllegalStateException(sprysb.cfr_renamed_9(" ,\u0010:\u0005'\u00166\u0010&U!\u0018#\u0005b\u0001#\u0017.\u0010b\u0003'\u00071\u001c-\u001bl"));
        }
        sprmzo sprmzo2 = arg0;
        return spryap.cfr_renamed_18639(sprmzo2, spryap.cfr_renamed_18638(sprmzo2, sprmzo2.cfr_renamed_13218() & 0xFFFF));
    }
}

