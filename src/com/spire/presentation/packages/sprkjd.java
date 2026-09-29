/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmaaa;
import com.spire.presentation.packages.sprphd;
import com.spire.presentation.packages.sprpj;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprqed;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprwzq;
import com.spire.presentation.packages.sprxdd;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprkjd
extends FilterOutputStream {
    private sprqk cfr_renamed_0;
    private sprpj cfr_renamed_1;
    private sprxdd cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    @Override
    public void write(byte[] arg0) throws IOException {
        this.write(arg0, 0, arg0.length);
    }

    @Override
    public void write(int arg0) throws IOException {
        sprkjd sprkjd2 = this;
        sprkjd2.cfr_renamed_4[0] = (byte)arg0;
        if (sprkjd2.cfr_renamed_0 != null) {
            sprkjd sprkjd3 = this;
            sprkjd3.out.write(sprkjd3.cfr_renamed_0.cfr_renamed_3243((byte)arg0));
            return;
        }
        sprkjd sprkjd4 = this;
        sprkjd4.write(sprkjd4.cfr_renamed_4, 0, 1);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_3490(int arg0, boolean arg1) {
        block6: {
            block4: {
                block5: {
                    var3_3 = arg0;
                    if (!arg1) break block4;
                    if (this.cfr_renamed_2 == null) break block5;
                    v0 = this;
                    v1 = v0;
                    var3_3 = v0.cfr_renamed_2.cfr_renamed_1202(arg0);
                    break block6;
                }
                if (this.cfr_renamed_1 == null) ** GOTO lbl22
                v2 = this;
                v1 = v2;
                var3_3 = v2.cfr_renamed_1.cfr_renamed_1202(arg0);
                break block6;
            }
            v3 = this;
            if (this.cfr_renamed_2 != null) {
                var3_3 = v3.cfr_renamed_2.cfr_renamed_2345(arg0);
                v1 = this;
            } else {
                if (v3.cfr_renamed_1 != null) {
                    var3_3 = this.cfr_renamed_1.cfr_renamed_2345(arg0);
                }
lbl22:
                // 4 sources

                v1 = this;
            }
        }
        if (v1.cfr_renamed_3 == null || this.cfr_renamed_3.length < var3_3) {
            this.cfr_renamed_3 = new byte[var3_3];
        }
    }

    @Override
    public void flush() throws IOException {
        this.out.flush();
    }

    /*
     * WARNING - void declaration
     */
    public sprkjd(OutputStream outputStream, sprxdd sprxdd2) {
        void arg0;
        sprkjd sprkjd2 = this;
        super((OutputStream)arg0);
        sprkjd2.cfr_renamed_4 = new byte[1];
        sprkjd2.cfr_renamed_2 = sprxdd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprkjd(OutputStream outputStream, sprpj sprpj2) {
        void arg0;
        sprkjd sprkjd2 = this;
        super((OutputStream)arg0);
        sprkjd2.cfr_renamed_4 = new byte[1];
        sprkjd2.cfr_renamed_1 = sprpj2;
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        sprkjd sprkjd2 = this;
        sprkjd2.cfr_renamed_3490(arg2, false);
        if (sprkjd2.cfr_renamed_2 != null) {
            int n = this.cfr_renamed_2.cfr_renamed_505(arg0, arg1, arg2, this.cfr_renamed_3, 0);
            if (n != 0) {
                sprkjd sprkjd3 = this;
                sprkjd3.out.write(sprkjd3.cfr_renamed_3, 0, n);
                return;
            }
        } else if (this.cfr_renamed_1 != null) {
            int n = this.cfr_renamed_1.cfr_renamed_505(arg0, arg1, arg2, this.cfr_renamed_3, 0);
            if (n != 0) {
                sprkjd sprkjd4 = this;
                sprkjd4.out.write(sprkjd4.cfr_renamed_3, 0, n);
                return;
            }
        } else {
            this.cfr_renamed_0.cfr_renamed_505(arg0, arg1, arg2, this.cfr_renamed_3, 0);
            sprkjd sprkjd5 = this;
            sprkjd5.out.write(sprkjd5.cfr_renamed_3, 0, arg2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        block10: {
            this.cfr_renamed_3490(0, true);
            var1_1 /* !! */  = null;
            try {
                if (this.cfr_renamed_2 != null) {
                    v0 = this;
                    var2_2 = v0.cfr_renamed_2.cfr_renamed_1219(v0.cfr_renamed_3, 0);
                    if (var2_2 != 0) {
                        v1 = this;
                        v1.out.write(v1.cfr_renamed_3, 0, var2_2);
                    }
                    break block10;
                }
                if (this.cfr_renamed_1 == null) break block10;
                v2 = this;
                var2_3 = v2.cfr_renamed_1.cfr_renamed_1219(v2.cfr_renamed_3, 0);
                if (var2_3 != 0) {
                    v3 = this;
                    v3.out.write(v3.cfr_renamed_3, 0, var2_3);
                }
            }
            catch (sprpjd var2_4) {
                var1_1 /* !! */  = new sprphd(sprwzq.cfr_renamed_9(" ,\u00171\u0017~\u00037\u000b?\t7\u00167\u000b9E=\f.\r;\u0017~\u0001?\u0011?"), var2_4);
                v4 = this;
                ** GOTO lbl27
            }
            catch (Exception var2_5) {
                var1_1 /* !! */  = new sprqed(sprmaaa.cfr_renamed_9("4w\u0003j\u0003%\u0012i\u001ev\u0018k\u0016%\u0002q\u0003`\u0010hK%"), var2_5);
            }
        }
        try {
            v4 = this;
lbl27:
            // 2 sources

            v4.flush();
            this.out.close();
            v5 /* !! */  = var1_1 /* !! */ ;
        }
        catch (IOException var2_6) {
            if (var1_1 /* !! */  == null) {
                var1_1 /* !! */  = var2_6;
            }
            v5 /* !! */  = var1_1 /* !! */ ;
        }
        if (v5 /* !! */  != null) {
            throw var1_1 /* !! */ ;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprkjd(OutputStream outputStream, sprqk sprqk2) {
        void arg0;
        sprkjd sprkjd2 = this;
        super((OutputStream)arg0);
        sprkjd2.cfr_renamed_4 = new byte[1];
        sprkjd2.cfr_renamed_0 = sprqk2;
    }
}

