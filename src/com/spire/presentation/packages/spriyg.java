/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragm;
import com.spire.presentation.packages.sprcrg;
import com.spire.presentation.packages.sprdbm;
import com.spire.presentation.packages.sprgcm;
import com.spire.presentation.packages.sprgwg;
import com.spire.presentation.packages.sprhbm;
import com.spire.presentation.packages.sprhzg;
import com.spire.presentation.packages.spricm;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprivy;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprjgba;
import com.spire.presentation.packages.sprkfm;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprlam;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprnvg;
import com.spire.presentation.packages.sprnzl;
import com.spire.presentation.packages.sproyl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpam;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprpnk;
import com.spire.presentation.packages.sprqgm;
import com.spire.presentation.packages.sprrd;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprssg;
import com.spire.presentation.packages.sprsxg;
import com.spire.presentation.packages.sprtm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprvjm;
import com.spire.presentation.packages.sprwem;
import com.spire.presentation.packages.sprxgm;
import com.spire.presentation.packages.sprysg;
import com.spire.presentation.packages.sprzcm;
import com.spire.presentation.packages.sprzyg;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class spriyg {
    public sprkfm cfr_renamed_3;
    public sprvbh cfr_renamed_4;

    public sprvbh cfr_renamed_1157() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spriyg(sprmah sprmah2, sprvbh sprvbh2, sprsm sprsm2, boolean bl, sprysg sprysg2) throws sprtqg {
        void arg2;
        void arg4;
        void arg0;
        void arg1;
        void arg3;
        spriyg spriyg2 = this;
        spriyg2.cfr_renamed_4 = spriyg.cfr_renamed_7736((boolean)arg3, (sprvbh)arg1);
        spriyg2.cfr_renamed_3 = spriyg.cfr_renamed_7737(bl, (sprmah)arg0, (sprvbh)arg1, (sprysg)arg4, (sprsm)arg2);
    }

    public spriyg(int arg0, sprcrg arg1, String arg2, sprhzg arg3, sprhzg arg4, sprtm arg5, sprysg arg6) throws sprtqg {
        this(arg0, arg1, arg2, null, arg3, arg4, arg5, arg6);
    }

    public static spriyg cfr_renamed_7717(spriyg arg0, sprvbh arg1) {
        if (arg1.cfr_renamed_7541() != arg0.cfr_renamed_7541()) {
            throw new IllegalArgumentException(sprjgba.cfr_renamed_9("xxjTWn3y|=}rg=~|g~{"));
        }
        return new spriyg(arg0.cfr_renamed_3, arg1);
    }

    public sprpik cfr_renamed_7738() {
        return this.cfr_renamed_3.cfr_renamed_7738();
    }

    public long cfr_renamed_7541() {
        return this.cfr_renamed_4.cfr_renamed_7541();
    }

    public Iterator<String> cfr_renamed_7712() {
        return this.cfr_renamed_4.cfr_renamed_7712();
    }

    public boolean cfr_renamed_7739() {
        int n = this.cfr_renamed_4.cfr_renamed_593();
        return n == 1 || n == 3 || n == 17 || n == 19 || n == 22 || n == 20;
    }

    public int cfr_renamed_7740() {
        return this.cfr_renamed_3.cfr_renamed_7740();
    }

    public static spriyg cfr_renamed_7741(InputStream arg0, sprrd arg1, sprvbh arg2) throws IOException, sprtqg {
        return new sprpnk(null).cfr_renamed_7742(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public spriyg(sprkfm sprkfm2, sprvbh sprvbh2) {
        void arg0;
        spriyg spriyg2 = this;
        spriyg2.cfr_renamed_3 = arg0;
        spriyg2.cfr_renamed_4 = sprvbh2;
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        sprjah sprjah2 = sprjah.cfr_renamed_7679(arg0);
        spriyg spriyg2 = this;
        sprjah2.cfr_renamed_7680(spriyg2.cfr_renamed_3);
        if (spriyg2.cfr_renamed_4.cfr_renamed_1226 != null) {
            sprjah2.cfr_renamed_7680(this.cfr_renamed_4.cfr_renamed_1226);
        }
        if (this.cfr_renamed_4.cfr_renamed_724 == null) {
            int n;
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_4.cfr_renamed_953.size()) {
                sprzyg sprzyg2 = this.cfr_renamed_4.cfr_renamed_953.get(n);
                sprzyg2.cfr_renamed_2623(sprjah2);
                n2 = ++n;
            }
            int n3 = n = 0;
            while (n3 != this.cfr_renamed_4.cfr_renamed_287.size()) {
                int n4;
                spriyg spriyg3;
                Object object;
                if (this.cfr_renamed_4.cfr_renamed_287.get(n) instanceof sprdbm) {
                    object = (sprdbm)this.cfr_renamed_4.cfr_renamed_287.get(n);
                    spriyg3 = this;
                    sprjah2.cfr_renamed_7680((sprzcm)object);
                } else {
                    object = (sprnvg)this.cfr_renamed_4.cfr_renamed_287.get(n);
                    spriyg3 = this;
                    sprjah2.cfr_renamed_7680(new sprnzl(((sprnvg)object).cfr_renamed_7563()));
                }
                if (spriyg3.cfr_renamed_4.cfr_renamed_3.get(n) != null) {
                    sprjah2.cfr_renamed_7680(this.cfr_renamed_4.cfr_renamed_3.get(n));
                }
                object = this.cfr_renamed_4.cfr_renamed_0.get(n);
                int n5 = n4 = 0;
                while (n5 != object.size()) {
                    Object e = object.get(n4);
                    ((sprzyg)e).cfr_renamed_2623(sprjah2);
                    n5 = ++n4;
                }
                n3 = ++n;
            }
        } else {
            int n;
            int n6 = n = 0;
            while (n6 != this.cfr_renamed_4.cfr_renamed_724.size()) {
                sprzyg sprzyg3 = this.cfr_renamed_4.cfr_renamed_724.get(n);
                sprzyg3.cfr_renamed_2623(sprjah2);
                n6 = ++n;
            }
        }
    }

    public byte[] cfr_renamed_5209() {
        return this.cfr_renamed_4.cfr_renamed_5209();
    }

    public sprcrg cfr_renamed_7743(sprgwg arg0) throws sprtqg {
        return new sprcrg(this.cfr_renamed_1157(), this.cfr_renamed_7744(arg0));
    }

    public spriyg(int arg0, sprcrg arg1, String arg2, sprsm arg3, sprhzg arg4, sprhzg arg5, sprtm arg6, sprysg arg7) throws sprtqg {
        this(arg1.cfr_renamed_1369(), spriyg.cfr_renamed_7745(arg0, arg1, arg2, arg4, arg5, arg6), arg3, true, arg7);
    }

    public boolean cfr_renamed_7722() {
        byte[] byArray = this.cfr_renamed_3.cfr_renamed_7746();
        return byArray == null || byArray.length < 1;
    }

    public static spriyg cfr_renamed_7723(spriyg arg0, sprgwg arg1, sprysg arg2) throws sprtqg {
        return spriyg.cfr_renamed_7747(arg0, arg1, arg2, null);
    }

    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public static spriyg cfr_renamed_7747(spriyg arg0, sprgwg arg1, sprysg arg2, sprsm arg3) throws sprtqg {
        spriyg spriyg2;
        Object object;
        byte[] byArray;
        if (arg0.cfr_renamed_7722()) {
            throw new sprtqg(sprivy.cfr_renamed_9("g-)2{+\u007f#}'))l;)+gb}*`1)\u0011l!{'}\tl;)o)2| e+jbb'pby0l1l,}bf,e;'"));
        }
        spriyg spriyg3 = arg0;
        byte[] byArray2 = spriyg3.cfr_renamed_7748(arg1);
        int n = spriyg3.cfr_renamed_3.cfr_renamed_7740();
        byte[] byArray3 = null;
        sprpik sprpik2 = null;
        int n2 = 0;
        if (arg2 == null || arg2.cfr_renamed_593() == 0) {
            n = 0;
            if (arg0.cfr_renamed_3.cfr_renamed_7740() == 254) {
                byArray = new byte[byArray2.length - 18];
                System.arraycopy(byArray2, 0, byArray, 0, byArray.length - 2);
                object = spriyg.cfr_renamed_7749(null, byArray, byArray.length - 2);
                byArray[byArray.length - 2] = object[0];
                byArray[byArray.length - 1] = object[1];
                spriyg2 = arg0;
            } else {
                byArray = byArray2;
                spriyg2 = arg0;
            }
        } else if (arg0.cfr_renamed_3.cfr_renamed_7735().cfr_renamed_3() < 4) {
            int n3;
            if (n == 0) {
                n = 255;
            }
            object = arg2.cfr_renamed_1521();
            byArray = new byte[byArray2.length];
            if (arg2.cfr_renamed_579() != 1) {
                throw new sprtqg(sprjgba.cfr_renamed_9("^Y&=Wttx`i3^rqph\u007f|gra=axbhzovy3{|o3kvo`t|s3.3vvd3x}~adci|o="));
            }
            int n4 = 0;
            int n5 = n3 = 0;
            while (n5 != 4) {
                byte[] byArray4;
                byte[] byArray5;
                int n6 = (((byArray2[n4] & 0xFF) << 8 | byArray2[n4 + 1] & 0xFF) + 7) / 8;
                int n7 = n4;
                byArray[n7] = byArray2[n7];
                byArray[n4 + 1] = byArray2[n4 + 1];
                if (n6 > byArray2.length - (n4 + 2)) {
                    throw new sprtqg(sprivy.cfr_renamed_9("f7}bf$)0h,n')'g!E'gbo-|,mb`,)0h5B'p\u0006h6h"));
                }
                if (n3 == 0) {
                    sprysg sprysg2 = arg2;
                    byArray5 = sprysg2.cfr_renamed_7750((byte[])object, byArray2, n4 + 2, n6);
                    byArray3 = sprysg2.cfr_renamed_7751();
                    byArray4 = byArray5;
                } else {
                    byte[] byArray6 = new byte[byArray3.length];
                    System.arraycopy(byArray, n4 - byArray3.length, byArray6, 0, byArray6.length);
                    byArray4 = arg2.cfr_renamed_7752((byte[])object, byArray6, byArray2, n4 + 2, n6);
                }
                System.arraycopy(byArray4, 0, byArray, n4 + 2, byArray5.length);
                n4 += 2 + n6;
                n5 = ++n3;
            }
            int n8 = n4;
            byArray[n8] = byArray2[n4];
            byArray[n8 + 1] = byArray2[n4 + 1];
            sprysg sprysg3 = arg2;
            sprpik2 = sprysg3.cfr_renamed_7738();
            n2 = sprysg3.cfr_renamed_593();
            spriyg2 = arg0;
        } else {
            sprysg sprysg4;
            if (n == 0) {
                if (arg3 != null) {
                    if (arg3.cfr_renamed_593() != 2) {
                        throw new IllegalArgumentException(sprjgba.cfr_renamed_9("r}qj=@UR0\"=`hcm|ogxw=ura=puv~xnfp`"));
                    }
                    n = 254;
                    object = spriyg.cfr_renamed_7749(arg3, byArray2, byArray2.length);
                    byArray2 = sproze.cfr_renamed_543(byArray2, (byte[])object);
                    byArray = arg2.cfr_renamed_7753(byArray2, 0, byArray2.length);
                    sprysg4 = arg2;
                } else {
                    n = 255;
                    byArray = arg2.cfr_renamed_7753(byArray2, 0, byArray2.length);
                    sprysg4 = arg2;
                }
            } else {
                byArray = arg2.cfr_renamed_7753(byArray2, 0, byArray2.length);
                sprysg4 = arg2;
            }
            byArray3 = sprysg4.cfr_renamed_7751();
            sprysg sprysg5 = arg2;
            sprpik2 = sprysg5.cfr_renamed_7738();
            n2 = sprysg5.cfr_renamed_593();
            spriyg2 = arg0;
        }
        object = spriyg2.cfr_renamed_3 instanceof sprwem ? (Object)new sprwem(arg0.cfr_renamed_3.cfr_renamed_7735(), n2, n, sprpik2, byArray3, byArray) : (Object)new sprkfm(arg0.cfr_renamed_3.cfr_renamed_7735(), n2, n, sprpik2, byArray3, byArray);
        return new spriyg((sprkfm)object, arg0.cfr_renamed_4);
    }

    public static spriyg cfr_renamed_7754(InputStream arg0, sprrd arg1, sprrk arg2) throws IOException, sprtqg {
        return new sprpnk(null).cfr_renamed_7755(arg0, arg1, arg2);
    }

    public Iterator<sprnvg> cfr_renamed_7756() {
        return this.cfr_renamed_4.cfr_renamed_7756();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_7749(sprsm arg0, byte[] arg1, int arg2) throws sprtqg {
        int n;
        if (arg0 != null) {
            OutputStream outputStream = arg0.cfr_renamed_470();
            try {
                OutputStream outputStream2 = outputStream;
                outputStream2.write(arg1, 0, arg2);
                outputStream2.close();
                return arg0.cfr_renamed_580();
            }
            catch (Exception exception) {
                throw new sprtqg(new StringBuilder().insert(0, sprivy.cfr_renamed_9("!a'j)z7dbm+n'z6)!h.j7e#}+f,)$h+e'mx)")).append(exception.getMessage()).toString(), exception);
            }
        }
        int n2 = 0;
        int n3 = n = 0;
        while (true) {
            if (n3 == arg2) {
                byte[] byArray;
                byte[] byArray2 = byArray = new byte[2];
                byArray2[0] = (byte)(n2 >> 8);
                byArray[1] = (byte)n2;
                return byArray2;
            }
            byte by = arg1[n];
            n2 += by & 0xFF;
            n3 = ++n;
        }
    }

    public spriyg(sprmah arg0, sprvbh arg1, sprsm arg2, sprysg arg3) throws sprtqg {
        this(arg0, arg1, arg2, false, arg3);
    }

    public int cfr_renamed_4000() {
        return this.cfr_renamed_3.cfr_renamed_7757();
    }

    private static /* synthetic */ sprkfm cfr_renamed_7737(boolean arg0, sprmah arg1, sprvbh arg2, sprysg arg3, sprsm arg4) throws sprtqg {
        sprklk sprklk2 = (sprklk)((Object)arg1.cfr_renamed_7758());
        if (sprklk2 == null) {
            if (arg0) {
                return new sprkfm(arg2.cfr_renamed_723, 0, null, null, new byte[0]);
            }
            return new sprwem(arg2.cfr_renamed_723, 0, null, null, new byte[0]);
        }
        try {
            int n;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            sprjah sprjah2 = new sprjah(byteArrayOutputStream);
            sprjah2.cfr_renamed_7759(sprklk2);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            int n2 = n = arg3 != null ? arg3.cfr_renamed_593() : 0;
            if (n != 0) {
                boolean bl;
                int n3;
                sprjah2.write(spriyg.cfr_renamed_7749(arg4, byArray, byArray.length));
                byArray = byteArrayOutputStream.toByteArray();
                byte[] byArray2 = arg3.cfr_renamed_7753(byArray, 0, byArray.length);
                sprysg sprysg2 = arg3;
                byte[] byArray3 = sprysg2.cfr_renamed_7751();
                sprpik sprpik2 = sprysg2.cfr_renamed_7738();
                if (arg4 != null) {
                    if (arg4.cfr_renamed_593() != 2) {
                        throw new sprtqg(sprjgba.cfr_renamed_9("r}qj=@UR,3nfmcraivy3{|o3vvd3~{xpv`h~=p|\u007f~fqrizr}n="));
                    }
                    n3 = 254;
                    bl = arg0;
                } else {
                    n3 = 255;
                    bl = arg0;
                }
                if (bl) {
                    return new sprkfm(arg2.cfr_renamed_723, n, n3, sprpik2, byArray3, byArray2);
                }
                return new sprwem(arg2.cfr_renamed_723, n, n3, sprpik2, byArray3, byArray2);
            }
            sprjah2.write(spriyg.cfr_renamed_7749(null, byArray, byArray.length));
            if (arg0) {
                return new sprkfm(arg2.cfr_renamed_723, n, null, null, byteArrayOutputStream.toByteArray());
            }
            return new sprwem(arg2.cfr_renamed_723, n, null, null, byteArrayOutputStream.toByteArray());
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprivy.cfr_renamed_9("\u0007q!l2}+f,)'g!{;y6`,nbb'p"), exception);
        }
    }

    private static /* synthetic */ sprvbh cfr_renamed_7736(boolean arg0, sprvbh arg1) {
        sprifm sprifm2 = arg1.cfr_renamed_723;
        if (arg0 && (!arg1.cfr_renamed_7760() || sprifm2.cfr_renamed_593() == 1)) {
            (sprvbh2 = new sprvbh(arg1)).cfr_renamed_723 = new sprifm(sprifm2.cfr_renamed_593(), sprifm2.cfr_renamed_2147(), sprifm2.cfr_renamed_1521());
            sprvbh sprvbh2 = new sprvbh(arg1);
            return sprvbh2;
        }
        sprvbh sprvbh3 = new sprvbh(arg1);
        sprvbh3.cfr_renamed_723 = new sprpam(sprifm2.cfr_renamed_593(), sprifm2.cfr_renamed_2147(), sprifm2.cfr_renamed_1521());
        return sprvbh3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmah cfr_renamed_7744(sprgwg arg0) throws sprtqg {
        if (this.cfr_renamed_7722()) {
            return null;
        }
        sprifm sprifm2 = this.cfr_renamed_3.cfr_renamed_7735();
        try {
            byte[] byArray = this.cfr_renamed_7748(arg0);
            sprmam sprmam2 = new sprmam(new ByteArrayInputStream(byArray));
            switch (sprifm2.cfr_renamed_593()) {
                case 1: 
                case 2: 
                case 3: {
                    sprhbm sprhbm2 = new sprhbm(sprmam2);
                    return new sprmah(this.cfr_renamed_7541(), sprifm2, sprhbm2);
                }
                case 17: {
                    sproyl sproyl2 = new sproyl(sprmam2);
                    return new sprmah(this.cfr_renamed_7541(), sprifm2, sproyl2);
                }
                case 16: 
                case 20: {
                    sprlam sprlam2 = new sprlam(sprmam2);
                    return new sprmah(this.cfr_renamed_7541(), sprifm2, sprlam2);
                }
                case 18: 
                case 19: {
                    sprgcm sprgcm2 = new sprgcm(sprmam2);
                    return new sprmah(this.cfr_renamed_7541(), sprifm2, sprgcm2);
                }
                case 22: {
                    spragm spragm2 = new spragm(sprmam2);
                    return new sprmah(this.cfr_renamed_7541(), sprifm2, spragm2);
                }
                case 25: {
                    return new sprmah(this.cfr_renamed_7541(), sprifm2, new sprqgm(sprmam2));
                }
                case 26: {
                    return new sprmah(this.cfr_renamed_7541(), sprifm2, new sprxgm(sprmam2));
                }
                case 27: {
                    return new sprmah(this.cfr_renamed_7541(), sprifm2, new spricm(sprmam2));
                }
                case 28: {
                    return new sprmah(this.cfr_renamed_7541(), sprifm2, new sprvjm(sprmam2));
                }
            }
            throw new sprtqg(sprjgba.cfr_renamed_9("h}v}rds3mf\u007f\u007ftp=xxj=rqtratgu~=vsprfsgxaxw"));
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprivy.cfr_renamed_9("\u0007q!l2}+f,)!f,z6{7j6`,nbb'p"), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spriyg(sprcrg arg0, sprcrg arg1, sprsm arg2, sprhzg arg3, sprhzg arg4, sprtm arg5, sprysg arg6) throws sprtqg {
        Object object;
        Object object2;
        sprssg sprssg2 = new sprssg(arg5);
        sprssg2.cfr_renamed_7538(24, arg0.cfr_renamed_1369());
        if (!arg1.cfr_renamed_1157().cfr_renamed_7760()) {
            if (arg3 == null) {
                object2 = new sprssg(arg5);
                ((sprssg)object2).cfr_renamed_7538(25, arg1.cfr_renamed_1369());
                object = new sprsxg();
                try {
                    sprsxg sprsxg2 = object;
                    sprsxg2.cfr_renamed_7647(false, ((sprssg)object2).cfr_renamed_7671(arg0.cfr_renamed_1157(), arg1.cfr_renamed_1157()));
                    arg3 = sprsxg2.cfr_renamed_31();
                }
                catch (IOException iOException) {
                    throw new sprtqg(iOException.getMessage(), iOException);
                }
            } else if (!arg3.cfr_renamed_7596(32)) {
                throw new sprtqg(sprjgba.cfr_renamed_9("`ttszst=`hqvvd3ovlftax`=vpqxwyvy3MAT^\\ADXXJBQT]YZST=`ttsrifov"));
            }
        }
        sprssg2.cfr_renamed_7666(arg3);
        sprssg2.cfr_renamed_7670(arg4);
        object2 = new ArrayList<sprzyg>();
        object2.add(sprssg2.cfr_renamed_7671(arg0.cfr_renamed_1157(), arg1.cfr_renamed_1157()));
        object = new sprvbh(arg1.cfr_renamed_1157(), null, (List<sprzyg>)object2);
        spriyg spriyg2 = this;
        Object object3 = object;
        ((sprvbh)object).cfr_renamed_723 = new sprpam(((sprvbh)object).cfr_renamed_593(), ((sprvbh)object).cfr_renamed_7696(), ((sprvbh)object).cfr_renamed_723.cfr_renamed_1521());
        spriyg2.cfr_renamed_4 = object;
        spriyg2.cfr_renamed_3 = spriyg.cfr_renamed_7737(false, arg1.cfr_renamed_1369(), arg1.cfr_renamed_1157(), arg6, arg2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ byte[] cfr_renamed_7748(sprgwg arg0) throws sprtqg {
        spriyg spriyg2 = this;
        byte[] byArray = spriyg2.cfr_renamed_3.cfr_renamed_7746();
        byte[] byArray2 = null;
        if (spriyg2.cfr_renamed_3.cfr_renamed_7757() == 0) return byArray;
        try {
            int n;
            int n2;
            int n3;
            if (this.cfr_renamed_3.cfr_renamed_7735().cfr_renamed_3() == 4) {
                byte[] byArray3;
                sprsm sprsm2;
                boolean bl;
                sprgwg sprgwg2 = arg0;
                byte[] byArray4 = sprgwg2.cfr_renamed_7761(this.cfr_renamed_3.cfr_renamed_7757(), this.cfr_renamed_3.cfr_renamed_7738());
                byArray2 = sprgwg2.cfr_renamed_7762(this.cfr_renamed_3.cfr_renamed_7757(), byArray4, this.cfr_renamed_3.cfr_renamed_1205(), byArray, 0, byArray.length);
                boolean bl2 = bl = this.cfr_renamed_3.cfr_renamed_7740() == 254;
                if (bl) {
                    sprsm2 = arg0.cfr_renamed_7763(2);
                    byArray3 = byArray2;
                } else {
                    sprsm2 = null;
                    byArray3 = byArray2;
                }
                byte[] byArray5 = spriyg.cfr_renamed_7749(sprsm2, byArray3, bl ? byArray2.length - 20 : byArray2.length - 2);
                if (sproze.cfr_renamed_5245(byArray5.length, byArray5, 0, byArray2, byArray2.length - byArray5.length)) return byArray2;
                throw new sprtqg(new StringBuilder().insert(0, sprivy.cfr_renamed_9("!a'j)z7dbd+z/h6j*)#}b`,)!a'j)z7dbf$)")).append(byArray5.length).append(sprjgba.cfr_renamed_9("=qdgx`")).toString());
            }
            byte[] byArray6 = arg0.cfr_renamed_7761(this.cfr_renamed_3.cfr_renamed_7757(), this.cfr_renamed_3.cfr_renamed_7738());
            byArray2 = new byte[byArray.length];
            byte[] byArray7 = new byte[this.cfr_renamed_3.cfr_renamed_1205().length];
            System.arraycopy(this.cfr_renamed_3.cfr_renamed_1205(), 0, byArray7, 0, byArray7.length);
            int n4 = 0;
            int n5 = n3 = 0;
            while (n5 != 4) {
                n2 = (((byArray[n4] & 0xFF) << 8 | byArray[n4 + 1] & 0xFF) + 7) / 8;
                int n6 = n4;
                byArray2[n6] = byArray[n6];
                byArray2[n4 + 1] = byArray[n4 + 1];
                if (n2 > byArray.length - (n4 + 2)) {
                    throw new sprtqg(sprivy.cfr_renamed_9("-|6)-ob{#g%lbl,j\u000el,)$f7g&)+gbl,j\u0006h6h"));
                }
                byte[] byArray8 = arg0.cfr_renamed_7762(this.cfr_renamed_3.cfr_renamed_7757(), byArray6, byArray7, byArray, n4 + 2, n2);
                System.arraycopy(byArray8, 0, byArray2, n4 + 2, byArray8.length);
                n4 += 2 + n2;
                if (n3 != 3) {
                    System.arraycopy(byArray, n4 - byArray7.length, byArray7, 0, byArray7.length);
                }
                n5 = ++n3;
            }
            int n7 = n4;
            byArray2[n7] = byArray[n4];
            byArray2[n7 + 1] = byArray[n4 + 1];
            n3 = byArray[n4] << 8 & 0xFF00 | byArray[n4 + 1] & 0xFF;
            n2 = 0;
            int n8 = n = 0;
            while (n8 < byArray2.length - 2) {
                byte by = byArray2[n];
                n2 += by & 0xFF;
                n8 = ++n;
            }
            if ((n2 &= 0xFFFF) == n3) return byArray2;
            throw new sprtqg(new StringBuilder().insert(0, sprjgba.cfr_renamed_9("~{xpv`h~=~t`pripu)=c|`ncua|`x3jar}z?=vecxpivy3")).append(Integer.toHexString(n3)).append(sprivy.cfr_renamed_9(")$f7g&)")).append(Integer.toHexString(n2)).toString());
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprjgba.cfr_renamed_9("Xk~vmgt|s3yv~adcizst=xxj"), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprvbh cfr_renamed_7745(int arg0, sprcrg arg1, String arg2, sprhzg arg3, sprhzg arg4, sprtm arg5) throws sprtqg {
        sprssg sprssg2;
        try {
            sprssg2 = new sprssg(arg5);
        }
        catch (Exception exception) {
            throw new sprtqg(new StringBuilder().insert(0, sprivy.cfr_renamed_9("!{'h6`,nbz+n,h6|0lbn'g'{#}-{x)")).append(exception).toString(), exception);
        }
        sprssg2.cfr_renamed_7538(arg0, arg1.cfr_renamed_1369());
        sprssg sprssg3 = sprssg2;
        sprssg3.cfr_renamed_7666(arg3);
        sprssg3.cfr_renamed_7670(arg4);
        try {
            sprzyg sprzyg2 = sprssg2.cfr_renamed_7672(arg2, arg1.cfr_renamed_1157());
            return sprvbh.cfr_renamed_7764(arg1.cfr_renamed_1157(), arg2, sprzyg2);
        }
        catch (Exception exception) {
            throw new sprtqg(new StringBuilder().insert(0, sprjgba.cfr_renamed_9("vepxcizr}=wrzst=pxaiz{z~rizr}'3")).append(exception).toString(), exception);
        }
    }

    public boolean cfr_renamed_7669() {
        return this.cfr_renamed_4.cfr_renamed_7669();
    }

    public spriyg(sprcrg arg0, sprcrg arg1, sprsm arg2, sprtm arg3, sprysg arg4) throws sprtqg {
        this(arg0, arg1, arg2, null, null, arg3, arg4);
    }
}

