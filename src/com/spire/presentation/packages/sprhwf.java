/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhze;
import com.spire.presentation.packages.sprkag;
import com.spire.presentation.packages.sprkbf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqvf;
import com.spire.presentation.packages.sprtff;
import com.spire.presentation.packages.spruhf;
import com.spire.presentation.packages.spruuf;
import com.spire.presentation.packages.sprveg;
import com.spire.presentation.packages.sprxye;

public class sprhwf {
    private final sprveg cfr_renamed_3;
    private final sprtff cfr_renamed_4;

    public sprkag cfr_renamed_123(byte[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = arg1;
        sprhwf sprhwf2 = this;
        byte[] byArray2 = new byte[sprhwf2.cfr_renamed_4.cfr_renamed_5428()];
        sprxye sprxye2 = sprhwf2.cfr_renamed_4.cfr_renamed_5431();
        sprxye sprxye3 = sprhwf2.cfr_renamed_4.cfr_renamed_5431();
        sprxye sprxye4 = sprhwf2.cfr_renamed_4.cfr_renamed_5431();
        sprxye sprxye5 = sprhwf2.cfr_renamed_4.cfr_renamed_5431();
        sprxye sprxye6 = sprxye2;
        sprxye sprxye7 = sprxye3;
        sprxye sprxye8 = sprxye4;
        sprxye sprxye9 = sprxye7;
        sprxye sprxye10 = sprxye4;
        sprxye sprxye11 = sprxye5;
        sprxye sprxye12 = sprxye7;
        sprxye sprxye13 = sprxye4;
        sprxye sprxye14 = sprxye5;
        sprxye sprxye15 = sprxye6;
        sprxye sprxye16 = sprxye8;
        sprxye sprxye17 = sprxye7;
        sprxye sprxye18 = sprxye6;
        sprxye18.cfr_renamed_5422(arg0);
        sprxye17.cfr_renamed_5404(byArray);
        sprxye17.cfr_renamed_5411();
        sprxye16.cfr_renamed_5401(sprxye18, sprxye7);
        sprxye9.cfr_renamed_5395(sprxye16);
        sprxye10.cfr_renamed_5404(sproze.cfr_renamed_533(byArray, this.cfr_renamed_4.cfr_renamed_5429(), byArray.length));
        sprxye sprxye19 = sprxye11;
        sprxye19.cfr_renamed_5400(sprxye9, sprxye10);
        byte[] byArray3 = sprxye19.cfr_renamed_5418(byArray2.length - this.cfr_renamed_4.cfr_renamed_5429());
        int n2 = 0;
        n2 = 0 | this.cfr_renamed_6395(arg0);
        if (this.cfr_renamed_4 instanceof sprhze) {
            n2 |= this.cfr_renamed_6396((spruhf)sprxye11);
        }
        sprxye12.cfr_renamed_5409(sprxye11);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.cfr_renamed_5403()) {
            int n4 = n;
            short s = (short)(sprxye6.cfr_renamed_3[n] - sprxye12.cfr_renamed_3[n4]);
            sprxye15.cfr_renamed_3[n4] = s;
            n3 = ++n;
        }
        sprxye13.cfr_renamed_5413(sproze.cfr_renamed_533(byArray, 2 * this.cfr_renamed_4.cfr_renamed_5429(), byArray.length));
        sprxye sprxye20 = sprxye14;
        sprxye14.cfr_renamed_5412(sprxye15, sprxye13);
        sprxye20.cfr_renamed_5414();
        byte[] byArray4 = sprxye20.cfr_renamed_5418(this.cfr_renamed_4.cfr_renamed_5428());
        System.arraycopy(byArray4, 0, byArray2, 0, byArray4.length);
        System.arraycopy(byArray3, 0, byArray2, this.cfr_renamed_4.cfr_renamed_5429(), byArray3.length);
        return new sprkag(byArray2, n2 |= this.cfr_renamed_6397(sprxye14));
    }

    private /* synthetic */ int cfr_renamed_6395(byte[] arg0) {
        short s = arg0[this.cfr_renamed_4.cfr_renamed_5436() - 1];
        s = (short)(s & 255 << 8 - (7 & this.cfr_renamed_4.cfr_renamed_5398() * this.cfr_renamed_4.cfr_renamed_5405()));
        return 1 & ~s + 1 >>> 15;
    }

    /*
     * WARNING - void declaration
     */
    public sprhwf(sprtff sprtff2) {
        void arg0;
        this.cfr_renamed_4 = sprtff2;
        sprhwf sprhwf2 = this;
        this.cfr_renamed_3 = new sprveg((sprtff)arg0);
    }

    private /* synthetic */ int cfr_renamed_6397(sprxye arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.cfr_renamed_5403() - 1) {
            short s = arg0.cfr_renamed_3[n];
            n2 |= s + 1 & this.cfr_renamed_4.cfr_renamed_5397() - 4;
            n2 |= s + 2 & 4;
            n3 = ++n;
        }
        return 1 & ~(n2 |= arg0.cfr_renamed_3[this.cfr_renamed_4.cfr_renamed_5403() - 1]) + 1 >>> 31;
    }

    private /* synthetic */ int cfr_renamed_6396(spruhf arg0) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_4.cfr_renamed_5403() - 1) {
            n3 = (short)(n3 + (arg0.cfr_renamed_3[n] & 1));
            int n6 = arg0.cfr_renamed_3[n] & 2;
            n4 = (short)(n4 + n6);
            n5 = ++n;
        }
        n2 |= n3 ^ n4 >>> 1;
        return 1 & ~(n2 |= n4 ^ ((sprhze)this.cfr_renamed_4).cfr_renamed_5441()) + 1 >>> 31;
    }

    public byte[] cfr_renamed_6398(sprxye arg0, sprxye arg1, byte[] arg2) {
        int n;
        sprxye sprxye2;
        sprhwf sprhwf2 = this;
        sprxye sprxye3 = sprhwf2.cfr_renamed_4.cfr_renamed_5431();
        sprxye sprxye4 = sprhwf2.cfr_renamed_4.cfr_renamed_5431();
        sprxye sprxye5 = sprxye2 = sprxye3;
        sprxye sprxye6 = sprxye4;
        sprxye2.cfr_renamed_5422(arg2);
        sprxye6.cfr_renamed_5401(arg0, sprxye2);
        sprxye5.cfr_renamed_5409(arg1);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_5403()) {
            int n3 = n;
            short s = (short)(sprxye6.cfr_renamed_3[n3] + sprxye5.cfr_renamed_3[n]);
            sprxye6.cfr_renamed_3[n3] = s;
            n2 = ++n;
        }
        return sprxye6.cfr_renamed_5415(this.cfr_renamed_4.cfr_renamed_5436());
    }

    public spruuf cfr_renamed_6399(byte[] arg0) {
        sprxye sprxye2;
        sprxye sprxye3;
        sprhwf sprhwf2 = this;
        byte[] byArray = new byte[sprhwf2.cfr_renamed_4.cfr_renamed_5427()];
        int n = sprhwf2.cfr_renamed_4.cfr_renamed_5403();
        int n2 = sprhwf2.cfr_renamed_4.cfr_renamed_5397();
        sprxye sprxye4 = sprhwf2.cfr_renamed_4.cfr_renamed_5431();
        sprxye sprxye5 = sprhwf2.cfr_renamed_4.cfr_renamed_5431();
        sprxye sprxye6 = sprhwf2.cfr_renamed_4.cfr_renamed_5431();
        sprxye sprxye7 = sprxye3 = sprxye4;
        sprxye sprxye8 = sprxye5;
        sprxye sprxye9 = sprxye6;
        sprxye sprxye10 = sprxye3;
        sprxye sprxye11 = sprxye3;
        sprqvf sprqvf2 = sprhwf2.cfr_renamed_3.cfr_renamed_6393(arg0);
        sprxye sprxye12 = sprqvf2.cfr_renamed_6387();
        sprxye sprxye13 = sprqvf2.cfr_renamed_6385();
        sprxye sprxye14 = sprxye12;
        sprxye3.cfr_renamed_5419(sprxye14);
        byte[] byArray2 = sprxye14.cfr_renamed_5418(this.cfr_renamed_4.cfr_renamed_5428());
        System.arraycopy(byArray2, 0, byArray, 0, byArray2.length);
        byte[] byArray3 = sprxye3.cfr_renamed_5418(byArray.length - this.cfr_renamed_4.cfr_renamed_5429());
        System.arraycopy(byArray3, 0, byArray, this.cfr_renamed_4.cfr_renamed_5429(), byArray3.length);
        sprxye12.cfr_renamed_5411();
        sprxye13.cfr_renamed_5411();
        if (this.cfr_renamed_4 instanceof sprkbf) {
            int n3;
            int n4 = n3 = n - 1;
            while (n4 > 0) {
                int n5 = n3;
                short s = (short)(3 * (sprxye13.cfr_renamed_3[n5 - 1] - sprxye13.cfr_renamed_3[n3]));
                sprxye13.cfr_renamed_3[n5] = s;
                n4 = --n3;
            }
            sprxye13.cfr_renamed_3[0] = (short)(-(3 * sprxye13.cfr_renamed_3[0]));
            sprxye2 = sprxye7;
        } else {
            int n6;
            int n7 = n6 = 0;
            while (n7 < n) {
                int n8 = n6++;
                sprxye13.cfr_renamed_3[n8] = (short)(3 * sprxye13.cfr_renamed_3[n8]);
                n7 = n6;
            }
            sprxye2 = sprxye7;
        }
        sprxye2.cfr_renamed_5401(sprxye13, sprxye12);
        sprxye sprxye15 = sprxye8;
        sprxye15.cfr_renamed_5421(sprxye7);
        sprxye9.cfr_renamed_5401(sprxye15, sprxye12);
        sprxye sprxye16 = sprxye10;
        sprxye16.cfr_renamed_5412(sprxye9, sprxye12);
        byte[] byArray4 = sprxye16.cfr_renamed_5410(byArray.length - 2 * this.cfr_renamed_4.cfr_renamed_5429());
        System.arraycopy(byArray4, 0, byArray, 2 * this.cfr_renamed_4.cfr_renamed_5429(), byArray4.length);
        sprxye9.cfr_renamed_5401(sprxye8, sprxye13);
        sprxye sprxye17 = sprxye11;
        sprxye17.cfr_renamed_5401(sprxye9, sprxye13);
        byte[] byArray5 = sprxye17.cfr_renamed_5415(this.cfr_renamed_4.cfr_renamed_5425());
        return new spruuf(byArray5, byArray);
    }
}

