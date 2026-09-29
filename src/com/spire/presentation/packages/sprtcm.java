/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxl;
import com.spire.presentation.packages.sprcjm;
import com.spire.presentation.packages.sprclg;
import com.spire.presentation.packages.sprhjm;
import com.spire.presentation.packages.spriql;
import com.spire.presentation.packages.sprjam;
import com.spire.presentation.packages.sprjim;
import com.spire.presentation.packages.sprkcm;
import com.spire.presentation.packages.sprkgm;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprmpl;
import com.spire.presentation.packages.sprnx;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprozl;
import com.spire.presentation.packages.sprphm;
import com.spire.presentation.packages.sprpnl;
import com.spire.presentation.packages.sprpzl;
import com.spire.presentation.packages.sprsam;
import com.spire.presentation.packages.sprscm;
import com.spire.presentation.packages.sprshl;
import com.spire.presentation.packages.sprsyl;
import com.spire.presentation.packages.sprszl;
import com.spire.presentation.packages.sprtbm;
import com.spire.presentation.packages.sprtxl;
import com.spire.presentation.packages.sprusl;
import com.spire.presentation.packages.sprvyl;
import com.spire.presentation.packages.sprxtl;
import com.spire.presentation.packages.sprxyl;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sprtcm
extends InputStream
implements sprnx {
    private final InputStream cfr_renamed_287;
    private final int cfr_renamed_724;

    @Override
    public int available() throws IOException {
        return this.cfr_renamed_287.available();
    }

    /*
     * WARNING - void declaration
     */
    public sprtcm(InputStream inputStream, int n) {
        void arg0;
        sprtcm sprtcm2 = this;
        sprtcm2.cfr_renamed_287 = arg0;
        sprtcm2.cfr_renamed_724 = n;
    }

    @Override
    public int read() throws IOException {
        return this.cfr_renamed_287.read();
    }

    public sprtcm(InputStream arg0) {
        InputStream inputStream = arg0;
        this(inputStream, sprtbm.cfr_renamed_4582(inputStream));
    }

    private /* synthetic */ byte[] cfr_renamed_11044(byte[] arg0, int arg1, int arg2, String arg3) throws EOFException {
        if (arg2 != arg1) {
            throw new EOFException(new StringBuilder().insert(0, sprshl.cfr_renamed_9(":\u0004;\u0018-\u0017:\u0013*V")).append(arg3).append(sprclg.cfr_renamed_9("V:\u0003+\u0006(\u0015\"\u0013=V-\u0017=\u0017g")).toString());
        }
        return sproze.cfr_renamed_533(arg0, 0, arg1);
    }

    public sprpnl cfr_renamed_7676() throws IOException {
        int n;
        int n2;
        boolean bl;
        byte[] byArray;
        boolean bl2;
        block40: {
            block39: {
                sprtcm sprtcm2;
                int n3 = this.read();
                int n4 = 0;
                if (n3 < 0) {
                    return null;
                }
                bl2 = false;
                if (n3 < 192) {
                    n4 = n3;
                    sprtcm2 = this;
                } else if (n3 <= 223) {
                    n4 = (n3 - 192 << 8) + this.cfr_renamed_287.read() + 192;
                    sprtcm2 = this;
                } else if (n3 == 255) {
                    bl2 = true;
                    sprtcm sprtcm3 = this;
                    sprtcm2 = sprtcm3;
                    n4 = this.cfr_renamed_287.read() << 24 | this.cfr_renamed_287.read() << 16 | this.cfr_renamed_287.read() << 8 | sprtcm3.cfr_renamed_287.read();
                } else {
                    throw new IOException(sprshl.cfr_renamed_9(";\u0018+\u000e>\u0013-\u0002+\u0012n\u001a+\u0018)\u0002&V&\u0013/\u0012+\u0004"));
                }
                int n5 = sprtcm2.cfr_renamed_287.read();
                if (n5 < 0) {
                    throw new EOFException(sprclg.cfr_renamed_9("<\u0018,\u000e9\u0013*\u0002,\u0012i3\u00060i\u0004,\u0017-\u001f'\u0011i\u0005 \u0011'\u0017=\u0003;\u0013i\u0005<\u0014i\u0006(\u0015\"\u0013="));
                }
                if (n4 <= 0 || n4 > this.cfr_renamed_724 && n4 > 2048) {
                    throw new EOFException(sprshl.cfr_renamed_9("\u0019;\u0002n\u0019(V<\u0017 \u0011+V*\u0017:\u0017n\u0010!\u0003 \u0012n\u001f V=\u001f)\u0018/\u0002;\u0004+V=\u0003,V>\u0017-\u001d+\u0002"));
                }
                byArray = new byte[n4 - 1];
                int n6 = sprkqe.cfr_renamed_476(this.cfr_renamed_287, byArray);
                bl = (n5 & 0x80) != 0;
                n2 = n5 & 0x7F;
                if (n6 == byArray.length) break block39;
                switch (n2) {
                    case 2: {
                        while (false) {
                        }
                        byArray = this.cfr_renamed_11044(byArray, 4, n6, sprclg.cfr_renamed_9("\u001a\u001f.\u0018(\u0002<\u0004,V\n\u0004,\u0017=\u001f&\u0018i\" \u001b,"));
                        n = n2;
                        break block40;
                    }
                    case 16: {
                        byArray = this.cfr_renamed_11044(byArray, 8, n6, "Issuer");
                        n = n2;
                        break block40;
                    }
                    case 9: {
                        byArray = this.cfr_renamed_11044(byArray, 4, n6, sprshl.cfr_renamed_9("%'\u0011 \u0017:\u0003<\u0013n=+\u000fn36\u0006'\u0004/\u0002'\u0019 V\u001a\u001f#\u0013"));
                        n = n2;
                        break block40;
                    }
                    case 3: {
                        byArray = this.cfr_renamed_11044(byArray, 4, n6, sprclg.cfr_renamed_9("\u001a\u001f.\u0018(\u0002<\u0004,V\f\u000e9\u001f;\u0017=\u001f&\u0018i\" \u001b,"));
                        n = n2;
                        break block40;
                    }
                    default: {
                        throw new EOFException(sprshl.cfr_renamed_9("\u0002<\u0003 \u0015/\u0002+\u0012n\u0005;\u0014>\u0017-\u001d+\u0002n\u0012/\u0002/X"));
                    }
                }
            }
            n = n2;
        }
        switch (n) {
            case 2: {
                return new sprmpl(bl, bl2, byArray);
            }
            case 32: {
                return new sprjam(bl, bl2, byArray);
            }
            case 9: {
                return new sprphm(bl, bl2, byArray);
            }
            case 3: {
                return new sprusl(bl, bl2, byArray);
            }
            case 7: {
                return new sprhjm(bl, bl2, byArray);
            }
            case 4: {
                return new sprvyl(bl, bl2, byArray);
            }
            case 30: {
                return new sprcjm(bl, bl2, byArray);
            }
            case 16: {
                return new sprxyl(bl, bl2, byArray);
            }
            case 5: {
                return new spriql(bl, bl2, byArray);
            }
            case 11: 
            case 21: 
            case 22: 
            case 39: {
                return new sprscm(n2, bl, bl2, byArray);
            }
            case 27: {
                return new sprkgm(bl, bl2, byArray);
            }
            case 26: {
                return new sprszl(bl, bl2, byArray);
            }
            case 25: {
                return new sprkcm(bl, bl2, byArray);
            }
            case 28: {
                return new sprbxl(bl, bl2, byArray);
            }
            case 20: {
                return new sprpzl(bl, bl2, byArray);
            }
            case 6: {
                return new sprsam(bl, bl2, byArray);
            }
            case 29: {
                return new sprtxl(bl, bl2, byArray);
            }
            case 12: {
                return new sprsyl(bl, bl2, byArray);
            }
            case 31: {
                return new sprxtl(bl, bl2, byArray);
            }
            case 33: {
                return new sprozl(bl, bl2, byArray);
            }
            case 35: {
                return new sprjim(bl, bl2, byArray);
            }
        }
        return new sprpnl(n2, bl, bl2, byArray);
    }
}

