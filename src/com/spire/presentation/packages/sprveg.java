/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhze;
import com.spire.presentation.packages.sprkbf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqvf;
import com.spire.presentation.packages.sprqze;
import com.spire.presentation.packages.sprrcba;
import com.spire.presentation.packages.sprtff;
import com.spire.presentation.packages.spruhf;
import com.spire.presentation.packages.sprxye;
import com.spire.presentation.packages.sprzuy;
import java.util.Arrays;

public class sprveg {
    private final sprtff cfr_renamed_4;

    private static /* synthetic */ int cfr_renamed_6389(int arg0) {
        return arg0 % 3;
    }

    public sprveg(sprtff sprtff2) {
        this.cfr_renamed_4 = sprtff2;
    }

    public sprxye cfr_renamed_6390(byte[] arg0) {
        int n;
        sprxye sprxye2 = this.cfr_renamed_4.cfr_renamed_5431();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_5403() - 1) {
            int n3 = n++;
            sprxye2.cfr_renamed_3[n3] = (short)sprveg.cfr_renamed_6389(arg0[n3] & 0xFF);
            n2 = n;
        }
        sprxye sprxye3 = sprxye2;
        sprxye3.cfr_renamed_3[this.cfr_renamed_4.cfr_renamed_5403() - 1] = 0;
        return sprxye3;
    }

    public spruhf cfr_renamed_6391(byte[] arg0) {
        int n;
        sprveg sprveg2 = this;
        int n2 = sprveg2.cfr_renamed_4.cfr_renamed_5403();
        int n3 = ((sprhze)sprveg2.cfr_renamed_4).cfr_renamed_5441();
        spruhf spruhf2 = new spruhf((sprhze)this.cfr_renamed_4);
        int[] nArray = new int[n2 - 1];
        int n4 = n = 0;
        while (n4 < (n2 - 1) / 4) {
            nArray[4 * n + 0] = ((arg0[15 * n + 0] & 0xFF) << 2) + ((arg0[15 * n + 1] & 0xFF) << 10) + ((arg0[15 * n + 2] & 0xFF) << 18) + ((arg0[15 * n + 3] & 0xFF) << 26);
            nArray[4 * n + 1] = ((arg0[15 + n * 3] & 0xFF & 0xC0) >> 4) + ((arg0[15 * n + 4] & 0xFF) << 4) + ((arg0[15 * n + 5] & 0xFF) << 12) + ((arg0[15 * n + 6] & 0xFF) << 20) + ((arg0[15 * n + 7] & 0xFF) << 28);
            nArray[4 * n + 2] = ((arg0[15 + n * 7] & 0xFF & 0xF0) >> 2) + ((arg0[15 * n + 8] & 0xFF) << 6) + ((arg0[15 * n + 9] & 0xFF) << 14) + ((arg0[15 * n + 10] & 0xFF) << 22) + ((arg0[15 * n + 11] & 0xFF) << 30);
            int n5 = 4 * n + 3;
            int n6 = (arg0[15 * n + 11] & 0xFF & 0xFC) + ((arg0[15 * n + 12] & 0xFF) << 8) + ((arg0[15 * n + 13] & 0xFF) << 16) + ((arg0[15 * n + 14] & 0xFF) << 24);
            nArray[n5] = n6;
            n4 = ++n;
        }
        if (n2 - 1 > (n2 - 1) / 4 * 4) {
            n = (n2 - 1) / 4;
            nArray[4 * n + 0] = ((arg0[15 * n + 0] & 0xFF) << 2) + ((arg0[15 * n + 1] & 0xFF) << 10) + ((arg0[15 * n + 2] & 0xFF) << 18) + ((arg0[15 * n + 3] & 0xFF) << 26);
            nArray[4 * n + 1] = ((arg0[15 + n * 3] & 0xFF & 0xC0) >> 4) + ((arg0[15 * n + 4] & 0xFF) << 4) + ((arg0[15 * n + 5] & 0xFF) << 12) + ((arg0[15 * n + 6] & 0xFF) << 20) + ((arg0[15 * n + 7] & 0xFF) << 28);
        }
        int n7 = n = 0;
        while (n7 < n3 / 2) {
            int n8 = n++;
            nArray[n8] = nArray[n8] | 1;
            n7 = n;
        }
        int n9 = n = n3 / 2;
        while (n9 < n3) {
            int n10 = n++;
            nArray[n10] = nArray[n10] | 2;
            n9 = n;
        }
        Arrays.sort(nArray);
        int n11 = n = 0;
        while (n11 < n2 - 1) {
            int n12 = n++;
            spruhf2.cfr_renamed_3[n12] = (short)(nArray[n12] & 3);
            n11 = n;
        }
        spruhf spruhf3 = spruhf2;
        spruhf3.cfr_renamed_3[n2 - 1] = 0;
        return spruhf3;
    }

    public sprqvf cfr_renamed_6392(byte[] arg0) {
        if (this.cfr_renamed_4 instanceof sprkbf) {
            sprveg sprveg2 = this;
            sprqze sprqze2 = (sprqze)sprveg2.cfr_renamed_6390(sproze.cfr_renamed_533(arg0, 0, sprveg2.cfr_renamed_4.cfr_renamed_5439()));
            sprveg sprveg3 = this;
            sprqze sprqze3 = (sprqze)sprveg3.cfr_renamed_6390(sproze.cfr_renamed_533(arg0, sprveg3.cfr_renamed_4.cfr_renamed_5439(), arg0.length));
            return new sprqvf(sprqze2, sprqze3);
        }
        if (this.cfr_renamed_4 instanceof sprhze) {
            sprveg sprveg4 = this;
            spruhf spruhf2 = (spruhf)sprveg4.cfr_renamed_6390(sproze.cfr_renamed_533(arg0, 0, sprveg4.cfr_renamed_4.cfr_renamed_5439()));
            sprveg sprveg5 = this;
            spruhf spruhf3 = sprveg5.cfr_renamed_6391(sproze.cfr_renamed_533(arg0, sprveg5.cfr_renamed_4.cfr_renamed_5439(), arg0.length));
            return new sprqvf(spruhf2, spruhf3);
        }
        throw new IllegalArgumentException(sprrcba.cfr_renamed_9("Fhygcok&\u007fic\u007faibonj/rvvj"));
    }

    public sprqvf cfr_renamed_6393(byte[] arg0) {
        if (this.cfr_renamed_4 instanceof sprkbf) {
            sprveg sprveg2 = this;
            sprqze sprqze2 = sprveg2.cfr_renamed_6394(sproze.cfr_renamed_533(arg0, 0, sprveg2.cfr_renamed_4.cfr_renamed_5439()));
            sprveg sprveg3 = this;
            sprqze sprqze3 = sprveg3.cfr_renamed_6394(sproze.cfr_renamed_533(arg0, sprveg3.cfr_renamed_4.cfr_renamed_5439(), arg0.length));
            return new sprqvf(sprqze2, sprqze3);
        }
        if (this.cfr_renamed_4 instanceof sprhze) {
            sprveg sprveg4 = this;
            spruhf spruhf2 = (spruhf)sprveg4.cfr_renamed_6390(sproze.cfr_renamed_533(arg0, 0, sprveg4.cfr_renamed_4.cfr_renamed_5439()));
            sprveg sprveg5 = this;
            spruhf spruhf3 = sprveg5.cfr_renamed_6391(sproze.cfr_renamed_533(arg0, sprveg5.cfr_renamed_4.cfr_renamed_5439(), arg0.length));
            return new sprqvf(spruhf2, spruhf3);
        }
        throw new IllegalArgumentException(sprzuy.cfr_renamed_9("=\n\u0002\u0005\u0018\r\u0010D\u0004\u000b\u0018\u001d\u001a\u000b\u0019\r\u0015\bT\u0010\r\u0014\u0011"));
    }

    public sprqze cfr_renamed_6394(byte[] byArray) {
        int n;
        sprveg sprveg2 = this;
        int n2 = sprveg2.cfr_renamed_4.cfr_renamed_5403();
        int n3 = 0;
        sprqze sprqze2 = (sprqze)sprveg2.cfr_renamed_6390(byArray);
        int n4 = n = 0;
        while (n4 < n2 - 1) {
            sprqze sprqze3 = sprqze2;
            int n5 = n;
            short s = (short)(sprqze3.cfr_renamed_3[n] | -(sprqze2.cfr_renamed_3[n5] >>> 1));
            sprqze3.cfr_renamed_3[n5] = s;
            n4 = ++n;
        }
        int n6 = n = 0;
        while (n6 < n2 - 1) {
            short s = (short)(sprqze2.cfr_renamed_3[n + 1] * sprqze2.cfr_renamed_3[n]);
            n3 = (short)(n3 + s);
            n6 = ++n;
        }
        n3 = (short)(1 | -((n3 & 0xFFFF) >>> 15));
        int n7 = n = 0;
        while (n7 < n2 - 1) {
            int n8 = n;
            sprqze2.cfr_renamed_3[n8] = (short)(n3 * sprqze2.cfr_renamed_3[n8]);
            n7 = n += 2;
        }
        int n9 = n = 0;
        while (n9 < n2 - 1) {
            int n10 = n;
            short s = (short)(3 & (sprqze2.cfr_renamed_3[n10] & 0xFFFF ^ (sprqze2.cfr_renamed_3[n] & 0xFFFF) >>> 15));
            sprqze2.cfr_renamed_3[n10] = s;
            n9 = ++n;
        }
        return sprqze2;
    }
}

