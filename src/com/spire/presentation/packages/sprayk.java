/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfib;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgrk;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sprtkk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtsk;
import com.spire.presentation.packages.sprxhl;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;

public class sprayk {
    private sprgrk cfr_renamed_0;
    private BufferedInputStream cfr_renamed_1;
    private boolean cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private BufferedOutputStream cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_10272(byte[] arg0) {
        this.cfr_renamed_0.cfr_renamed_5535(false, new sprtpk(arg0));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.cfr_renamed_1));
        try {
            int n;
            byte[] byArray = null;
            byte[] byArray2 = null;
            String string = null;
            block4: while (true) {
                BufferedReader bufferedReader2 = bufferedReader;
                while ((string = bufferedReader2.readLine()) != null) {
                    byArray = sprfqe.cfr_renamed_488(string);
                    byArray2 = new byte[this.cfr_renamed_0.cfr_renamed_1202(byArray.length)];
                    n = this.cfr_renamed_0.cfr_renamed_505(byArray, 0, byArray.length, byArray2, 0);
                    if (n <= 0) continue block4;
                    bufferedReader2 = bufferedReader;
                    this.cfr_renamed_4.write(byArray2, 0, n);
                }
                break;
            }
            try {
                n = this.cfr_renamed_0.cfr_renamed_1219(byArray2, 0);
                if (n <= 0) return;
                this.cfr_renamed_4.write(byArray2, 0, n);
                return;
            }
            catch (sprmml sprmml2) {
                return;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void main(String[] arg0) {
        sprayk sprayk2;
        boolean bl = true;
        String string = null;
        String string2 = null;
        String string3 = null;
        if (arg0.length < 2) {
            sprayk2 = new sprayk();
            System.err.println(new StringBuilder().insert(0, sprfib.cfr_renamed_9("\u00192-&){l+-7-a")).append(sprayk2.getClass().getName()).append(sprtkk.cfr_renamed_9("J\\\u0004S\u0003Y\u000f\u0015\u0005@\u001eS\u0003Y\u000f\u00151^\u000fL\f\\\u0006P7")).toString());
            System.exit(1);
        }
        string3 = sprfib.cfr_renamed_9("($?*)8b%-5");
        string = arg0[0];
        string2 = arg0[1];
        if (arg0.length > 2) {
            bl = false;
            string3 = arg0[2];
        }
        sprayk2 = new sprayk(string, string2, string3, bl);
        sprayk2.cfr_renamed_9794();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprayk(String var1_1, String var2_2, String var3_3, boolean var4_4) {
        block11: {
            v0 = this;
            v1 = this;
            v2 = this;
            super();
            v2.cfr_renamed_2 = true;
            v2.cfr_renamed_0 = null;
            v1.cfr_renamed_1 = null;
            v1.cfr_renamed_4 = null;
            v0.cfr_renamed_3 = null;
            v0.cfr_renamed_2 = var4_4;
            try {
                this.cfr_renamed_1 = new BufferedInputStream(new FileInputStream((String)arg0));
                v3 = this;
                ** GOTO lbl20
            }
            catch (FileNotFoundException var5_5) {
                System.err.println(new StringBuilder().insert(0, sprtkk.cfr_renamed_9("|\u0004E\u001fAJS\u0003Y\u000f\u0015\u0004Z\u001e\u0015\fZ\u001f[\u000e\u00151")).append((String)arg0).append("]").toString());
                System.exit(1);
                try {
                    v3 = this;
lbl20:
                    // 2 sources

                    v3.cfr_renamed_4 = new BufferedOutputStream(new FileOutputStream((String)arg1));
                }
                catch (IOException var5_6) {
                    System.err.println(new StringBuilder().insert(0, sprfib.cfr_renamed_9("\u000e95<48a*( $l/#5l\">$-5)%l\u001a")).append((String)arg1).append("]").toString());
                    System.exit(1);
                    v4 = arg3;
                    break block11;
                }
            }
            v4 = arg3;
        }
        if (v4 != false) {
            try {
                var5_7 = null;
                try {
                    var5_7 = new SecureRandom();
                    var5_7.setSeed(sprtkk.cfr_renamed_9("B\u001dBDW\u0005@\u0004V\u0013V\u000bF\u001eY\u000f\u001b\u0005G\r").getBytes());
                }
                catch (Exception var6_10) {
                    System.err.println(sprfib.cfr_renamed_9("\u0004,!,`a\".l\u0012\u0004\u0000}\u0011\u001e\u000f\u000bml8#4l/)$(a8))a\u001f4\"a%,<-),)/8 8(#/"));
                    System.exit(1);
                }
                var6_11 = new sprgye((SecureRandom)var5_7, 192);
                var7_13 = new sprtsk();
                var7_13.cfr_renamed_5536(var6_11);
                this.cfr_renamed_3 = var7_13.cfr_renamed_2405();
                var8_15 = new BufferedOutputStream(new FileOutputStream((String)arg2));
                var9_16 = sprfqe.cfr_renamed_485(this.cfr_renamed_3);
                var8_15.write(var9_16, 0, var9_16.length);
                v5 = var8_15;
                v5.flush();
                v5.close();
                return;
            }
            catch (IOException var5_8) {
                System.err.println(new StringBuilder().insert(0, sprtkk.cfr_renamed_9("v\u0005@\u0006QJ[\u0005AJQ\u000fV\u0018L\u001aA\u0003Z\u0004\u0015\tG\u000fT\u001ePJ^\u000fLJS\u0003Y\u000f\u00151")).append((String)arg2).append("]").toString());
                System.exit(1);
                return;
            }
        }
        try {
            var5_7 = new BufferedInputStream(new FileInputStream((String)arg2));
            var6_12 = var5_7.available();
            var7_14 = new byte[var6_12];
            var5_7.read(var7_14, 0, var6_12);
            this.cfr_renamed_3 = sprfqe.cfr_renamed_496(var7_14);
            return;
        }
        catch (IOException var5_9) {
            System.err.println(new StringBuilder().insert(0, sprfib.cfr_renamed_9("\u0005)\">8<5%.\"a'$5a*( $l/#5l'#4\"%`a#3l/#5l7--%%l\u001a")).append((String)arg2).append("]").toString());
            System.exit(1);
            return;
        }
    }

    public sprayk() {
        sprayk sprayk2 = this;
        sprayk sprayk3 = this;
        this.cfr_renamed_2 = true;
        sprayk3.cfr_renamed_0 = null;
        sprayk3.cfr_renamed_1 = null;
        sprayk2.cfr_renamed_4 = null;
        sprayk2.cfr_renamed_3 = null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9794() {
        block2: {
            this.cfr_renamed_0 = new sprgrk(new sprhqk(new sprxhl()));
            if (!this.cfr_renamed_2) break block2;
            v0 = this;
            v1 = v0;
            v0.cfr_renamed_10273(v0.cfr_renamed_3);
            ** GOTO lbl14
        }
        v2 = this;
        v2.cfr_renamed_10272(v2.cfr_renamed_3);
        try {
            v1 = this;
lbl14:
            // 2 sources

            v1.cfr_renamed_1.close();
            v3 = this;
            v3.cfr_renamed_4.flush();
            v3.cfr_renamed_4.close();
            return;
        }
        catch (IOException var1_1) {
            System.err.println(new StringBuilder().insert(0, sprtkk.cfr_renamed_9("\u000fM\tP\u001aA\u0003Z\u0004\u0015\tY\u0005F\u0003[\r\u0015\u0018P\u0019Z\u001fG\tP\u0019\u000fJ")).append(var1_1.getMessage()).toString());
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_10273(byte[] byArray) {
        void arg0;
        sprayk sprayk2 = this;
        sprayk2.cfr_renamed_0.cfr_renamed_5535(true, new sprtpk((byte[])arg0));
        int n = 47;
        int n2 = sprayk2.cfr_renamed_0.cfr_renamed_1202(n);
        byte[] byArray2 = new byte[n];
        byte[] byArray3 = new byte[n2];
        try {
            int n3;
            byte[] byArray4 = null;
            block4: while (true) {
                int n4;
                sprayk sprayk3 = this;
                while ((n4 = sprayk3.cfr_renamed_1.read(byArray2, 0, n)) > 0) {
                    n3 = this.cfr_renamed_0.cfr_renamed_505(byArray2, 0, n4, byArray3, 0);
                    if (n3 <= 0) continue block4;
                    byArray4 = sprfqe.cfr_renamed_502(byArray3, 0, n3);
                    this.cfr_renamed_4.write(byArray4, 0, byArray4.length);
                    sprayk sprayk4 = this;
                    sprayk3 = sprayk4;
                    sprayk4.cfr_renamed_4.write(10);
                }
                break;
            }
            try {
                n3 = this.cfr_renamed_0.cfr_renamed_1219(byArray3, 0);
                if (n3 <= 0) return;
                byArray4 = sprfqe.cfr_renamed_502(byArray3, 0, n3);
                this.cfr_renamed_4.write(byArray4, 0, byArray4.length);
                this.cfr_renamed_4.write(10);
                return;
            }
            catch (sprmml sprmml2) {
                return;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

