/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyo;
import com.spire.presentation.packages.sprexo;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprhnn {
    private sprbyo cfr_renamed_3;
    private sprexo cfr_renamed_4;

    private /* synthetic */ sprxln cfr_renamed_13520(boolean arg0) {
        int n = arg0 ? -1 : 1;
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = new sprlsn();
        sprhnn sprhnn2 = this;
        sprhnn2.cfr_renamed_3 = sprhnn2.cfr_renamed_4.cfr_renamed_13187().cfr_renamed_576(0);
        sprhnn2.cfr_renamed_3.cfr_renamed_13521(true);
        sprbyo sprbyo2 = sprhnn2.cfr_renamed_3;
        float[] fArray = new float[2];
        fArray[0] = this.cfr_renamed_3.cfr_renamed_1980();
        fArray[1] = n * this.cfr_renamed_3.spr\u3181();
        sprlsn2.cfr_renamed_12507(new sprfqn(fArray));
        int n2 = 1;
        int n3 = n2;
        while (n3 <= this.cfr_renamed_4.cfr_renamed_13187().cfr_renamed_11861()) {
            sprbyo sprbyo3;
            sprbyo sprbyo4;
            sprbyo sprbyo5;
            if (n2 >= this.cfr_renamed_4.cfr_renamed_13187().cfr_renamed_11861() || sprbyo2.cfr_renamed_13522()) {
                sprhnn sprhnn3 = this;
                sprbyo5 = sprhnn3.cfr_renamed_13523(sprhnn3.cfr_renamed_4.cfr_renamed_13187().cfr_renamed_576(n2));
            } else {
                sprbyo5 = sprbyo4 = this.cfr_renamed_4.cfr_renamed_13187().cfr_renamed_576(n2);
            }
            if (sprbyo4.cfr_renamed_13524() || sprbyo4.cfr_renamed_13525()) {
                float[] fArray2 = new float[2];
                fArray2[0] = sprbyo4.cfr_renamed_1980();
                fArray2[1] = n * sprbyo4.spr\u3181();
                sprlsn2.cfr_renamed_12507(new sprfqn(fArray2));
                sprbyo3 = sprbyo2;
            } else {
                sprbyo sprbyo6;
                sprbyo sprbyo7;
                if (n2 + 1 >= this.cfr_renamed_4.cfr_renamed_13187().cfr_renamed_11861() || sprbyo4.cfr_renamed_13522()) {
                    sprhnn sprhnn4 = this;
                    sprbyo7 = sprhnn4.cfr_renamed_13523(sprhnn4.cfr_renamed_4.cfr_renamed_13187().cfr_renamed_576(n2 + 1));
                } else {
                    sprbyo7 = sprbyo6 = this.cfr_renamed_4.cfr_renamed_13187().cfr_renamed_576(n2 + 1);
                }
                if (sprbyo6.cfr_renamed_13524()) {
                    sprlsn2.cfr_renamed_12507(new sprxnn(new sprsuja(sprbyo2.cfr_renamed_1980(), n * sprbyo2.spr\u3181()), new sprsuja(sprbyo4.cfr_renamed_1980(), n * sprbyo4.spr\u3181()), new sprsuja(sprbyo6.cfr_renamed_1980(), n * sprbyo6.spr\u3181())));
                    ++n2;
                    sprbyo2 = sprbyo4;
                    sprbyo4 = sprbyo6;
                    sprbyo3 = sprbyo2;
                } else {
                    sprbyo sprbyo8 = sprbyo6;
                    int n4 = spryxp.cfr_renamed_13526((float)(sprbyo8.cfr_renamed_1980() - sprbyo4.cfr_renamed_1980()) / 2.0f);
                    int n5 = spryxp.cfr_renamed_13526((float)(sprbyo8.spr\u3181() - sprbyo4.spr\u3181()) / 2.0f);
                    int n6 = n4;
                    sprbyo sprbyo9 = new sprbyo(n6, n5, sprbyo4.cfr_renamed_1980() + n6, sprbyo4.spr\u3181() + n5, true, false);
                    sprlsn2.cfr_renamed_12507(new sprxnn(new sprsuja(sprbyo2.cfr_renamed_1980(), n * sprbyo2.spr\u3181()), new sprsuja(sprbyo4.cfr_renamed_1980(), n * sprbyo4.spr\u3181()), new sprsuja(sprbyo9.cfr_renamed_1980(), n * sprbyo9.spr\u3181())));
                    sprbyo2 = sprbyo4;
                    sprbyo4 = sprbyo9;
                    sprbyo3 = sprbyo2;
                }
            }
            if (sprbyo3.cfr_renamed_13522()) {
                sprlsn2 = sprhnn.cfr_renamed_13527(sprlsn2, sprxln2);
                if (n2 < this.cfr_renamed_4.cfr_renamed_13187().cfr_renamed_11861()) {
                    sprbyo4 = this.cfr_renamed_4.cfr_renamed_13187().cfr_renamed_576(n2);
                }
            }
            sprbyo2 = sprbyo4;
            n3 = ++n2;
        }
        if (this.cfr_renamed_3 != null && sprlsn2.cfr_renamed_11861() > 0) {
            float[] fArray3 = new float[2];
            fArray3[0] = this.cfr_renamed_3.cfr_renamed_1980();
            fArray3[1] = n * this.cfr_renamed_3.spr\u3181();
            sprlsn2.cfr_renamed_12507(new sprfqn(fArray3));
        }
        if (sprlsn2.cfr_renamed_11861() > 0) {
            sprhnn.cfr_renamed_13527(sprlsn2, sprxln2);
        }
        return sprxln2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 3;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 3 << 3 ^ 4;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private /* synthetic */ sprhnn(sprexo sprexo2) {
        this.cfr_renamed_4 = sprexo2;
    }

    private /* synthetic */ sprbyo cfr_renamed_13523(sprbyo arg0) {
        sprbyo sprbyo2 = this.cfr_renamed_3;
        if (arg0 != null) {
            this.cfr_renamed_3 = arg0;
            this.cfr_renamed_3.cfr_renamed_13521(true);
        }
        return sprbyo2;
    }

    private static /* synthetic */ sprlsn cfr_renamed_13527(sprlsn sprlsn2, sprxln sprxln2) {
        sprlsn arg0;
        sprlsn sprlsn3 = arg0;
        sprlsn3.cfr_renamed_12625(true);
        sprxln2.cfr_renamed_12507(sprlsn3);
        return new sprlsn();
    }

    public static sprxln cfr_renamed_13483(sprexo arg0, boolean arg1) {
        return new sprhnn(arg0).cfr_renamed_13520(arg1);
    }

    public static sprxln cfr_renamed_13528(sprexo arg0) {
        return sprhnn.cfr_renamed_13483(arg0, true);
    }
}

