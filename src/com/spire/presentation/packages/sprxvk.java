/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdbl;
import com.spire.presentation.packages.sprdqp;
import com.spire.presentation.packages.sprhhj;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwzk;
import com.spire.presentation.packages.sprzu;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprxvk
extends FilterOutputStream {
    private byte[] cfr_renamed_0;
    private sprzu cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private sprvv cfr_renamed_3;
    private sprirk cfr_renamed_4;

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        sprxvk sprxvk2 = this;
        sprxvk2.cfr_renamed_3490(arg2, false);
        if (sprxvk2.cfr_renamed_4 != null) {
            int n = this.cfr_renamed_4.cfr_renamed_505(arg0, arg1, arg2, this.cfr_renamed_0, 0);
            if (n != 0) {
                sprxvk sprxvk3 = this;
                sprxvk3.out.write(sprxvk3.cfr_renamed_0, 0, n);
                return;
            }
        } else if (this.cfr_renamed_1 != null) {
            int n = this.cfr_renamed_1.cfr_renamed_505(arg0, arg1, arg2, this.cfr_renamed_0, 0);
            if (n != 0) {
                sprxvk sprxvk4 = this;
                sprxvk4.out.write(sprxvk4.cfr_renamed_0, 0, n);
                return;
            }
        } else {
            this.cfr_renamed_3.cfr_renamed_505(arg0, arg1, arg2, this.cfr_renamed_0, 0);
            sprxvk sprxvk5 = this;
            sprxvk5.out.write(sprxvk5.cfr_renamed_0, 0, arg2);
        }
    }

    @Override
    public void write(int arg0) throws IOException {
        sprxvk sprxvk2 = this;
        sprxvk2.cfr_renamed_2[0] = (byte)arg0;
        if (sprxvk2.cfr_renamed_3 != null) {
            sprxvk sprxvk3 = this;
            sprxvk3.out.write(sprxvk3.cfr_renamed_3.cfr_renamed_3243((byte)arg0));
            return;
        }
        sprxvk sprxvk4 = this;
        sprxvk4.write(sprxvk4.cfr_renamed_2, 0, 1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void close() throws IOException {
        this.cfr_renamed_3490(0, true);
        var1_1 /* !! */  = null;
        try {
            if (this.cfr_renamed_4 != null) {
                v0 = this;
                var2_2 = v0.cfr_renamed_4.cfr_renamed_1219(v0.cfr_renamed_0, 0);
                if (var2_2 != 0) {
                    v1 = this;
                    v1.out.write(v1.cfr_renamed_0, 0, var2_2);
                }
            } else if (this.cfr_renamed_1 != null) {
                v2 = this;
                var2_3 = v2.cfr_renamed_1.cfr_renamed_1219(v2.cfr_renamed_0, 0);
                if (var2_3 != 0) {
                    v3 = this;
                    v3.out.write(v3.cfr_renamed_0, 0, var2_3);
                }
            } else if (this.cfr_renamed_3 != null) {
                this.cfr_renamed_3.cfr_renamed_41();
            }
        }
        catch (sprull var2_4) {
            var1_1 /* !! */  = new sprdbl(sprhhj.cfr_renamed_9("!\u0013\u0016\u000e\u0016A\u0002\b\n\u0000\b\b\u0017\b\n\u0006D\u0002\r\u0011\f\u0004\u0016A\u0000\u0000\u0010\u0000"), var2_4);
            v4 = this;
            ** GOTO lbl29
        }
        catch (Exception var2_5) {
            var1_1 /* !! */  = new sprwzk(sprdqp.cfr_renamed_9("\u001e:)')h8$4;2&<h(<)-:%ah"), var2_5);
        }
        try {
            v4 = this;
lbl29:
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
    public sprxvk(OutputStream outputStream, sprvv sprvv2) {
        void arg0;
        sprxvk sprxvk2 = this;
        super((OutputStream)arg0);
        sprxvk2.cfr_renamed_2 = new byte[1];
        sprxvk2.cfr_renamed_3 = sprvv2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxvk(OutputStream outputStream, sprzu sprzu2) {
        void arg0;
        sprxvk sprxvk2 = this;
        super((OutputStream)arg0);
        sprxvk2.cfr_renamed_2 = new byte[1];
        sprxvk2.cfr_renamed_1 = sprzu2;
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
                    if (this.cfr_renamed_4 == null) break block5;
                    v0 = this;
                    v1 = v0;
                    var3_3 = v0.cfr_renamed_4.cfr_renamed_1202(arg0);
                    break block6;
                }
                if (this.cfr_renamed_1 == null) ** GOTO lbl22
                v2 = this;
                v1 = v2;
                var3_3 = v2.cfr_renamed_1.cfr_renamed_1202(arg0);
                break block6;
            }
            v3 = this;
            if (this.cfr_renamed_4 != null) {
                var3_3 = v3.cfr_renamed_4.cfr_renamed_2345(arg0);
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
        if (v1.cfr_renamed_0 == null || this.cfr_renamed_0.length < var3_3) {
            this.cfr_renamed_0 = new byte[var3_3];
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprxvk(OutputStream outputStream, sprirk sprirk2) {
        void arg0;
        sprxvk sprxvk2 = this;
        super((OutputStream)arg0);
        sprxvk2.cfr_renamed_2 = new byte[1];
        sprxvk2.cfr_renamed_4 = sprirk2;
    }

    @Override
    public void write(byte[] arg0) throws IOException {
        this.write(arg0, 0, arg0.length);
    }

    @Override
    public void flush() throws IOException {
        this.out.flush();
    }
}

