/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprghf;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhum;
import com.spire.presentation.packages.spridf;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprjqm;
import com.spire.presentation.packages.sprkol;
import com.spire.presentation.packages.sprkye;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmtm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprqzz;
import com.spire.presentation.packages.sprrpl;
import com.spire.presentation.packages.sprsff;
import com.spire.presentation.packages.sprsv;
import com.spire.presentation.packages.sprsvl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.spruem;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxqy;
import com.spire.presentation.packages.sprypl;
import com.spire.presentation.packages.spryqm;
import com.spire.presentation.packages.sprywl;
import com.spire.presentation.packages.sprzhm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;

public class sprqxe {
    public sprrpl cfr_renamed_1;
    public sprywl cfr_renamed_2;
    public sprghf cfr_renamed_3;
    public spridf cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprywl cfr_renamed_5294(sprlvm arg0) throws sprahf {
        try {
            return new sprywl(arg0);
        }
        catch (sprlyl sprlyl2) {
            throw new sprahf(new StringBuilder().insert(0, sprxqy.cfr_renamed_9("\u000er\n\u0001*@(R3O=\u0001?S(N(\u001bz")).append(sprlyl2.getMessage()).toString(), sprlyl2.getCause());
        }
    }

    public sprkol cfr_renamed_634() {
        return this.cfr_renamed_1.cfr_renamed_634();
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_2.cfr_renamed_104("DL");
    }

    public sprjpm cfr_renamed_574() {
        return this.cfr_renamed_1.cfr_renamed_574();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = 5 << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 << 2 ^ 3);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_5295(sprsvl arg0) throws sprahf {
        try {
            return this.cfr_renamed_1.cfr_renamed_5296(arg0);
        }
        catch (sprlyl sprlyl2) {
            if (sprlyl2.cfr_renamed_584() != null) {
                throw new sprahf(sprlyl2.getMessage(), sprlyl2.cfr_renamed_584());
            }
            throw new sprahf(new StringBuilder().insert(0, sprqzz.cfr_renamed_9(",\u0014<y\n!\f<\u001f-\u00066\u0001cO")).append(sprlyl2).toString(), sprlyl2);
        }
    }

    public sprug<sprypl> cfr_renamed_618() {
        return this.cfr_renamed_2.cfr_renamed_618();
    }

    public sprug<sprpxl> cfr_renamed_633() {
        return this.cfr_renamed_2.cfr_renamed_633();
    }

    public sprqxe(sprlvm arg0) throws sprahf, IOException {
        this(sprqxe.cfr_renamed_5294(arg0));
    }

    public byte[] cfr_renamed_104(String arg0) throws IOException {
        return this.cfr_renamed_2.cfr_renamed_104(arg0);
    }

    public sprywl cfr_renamed_637() {
        return this.cfr_renamed_2;
    }

    public sprug<sprtpl> cfr_renamed_617() {
        return this.cfr_renamed_2.cfr_renamed_617();
    }

    public void cfr_renamed_5297(sprsvl arg0) throws sprahf, sprsff {
        if (!arg0.cfr_renamed_613()) {
            throw new IllegalArgumentException(sprxqy.cfr_renamed_9(",D(H<H?SzQ(N,H>D(\u00014D?E)\u0001;Oz@)R5B3@.D>\u00019D(U3G3B;U?"));
        }
        try {
            OutputStream outputStream;
            sprsvl sprsvl2 = arg0;
            sprtpl sprtpl2 = sprsvl2.cfr_renamed_614();
            sprjj sprjj2 = sprsvl2.cfr_renamed_5298(this.cfr_renamed_3.cfr_renamed_579());
            OutputStream outputStream2 = outputStream = sprjj2.cfr_renamed_470();
            outputStream2.write(sprtpl2.cfr_renamed_91());
            outputStream2.close();
            if (!sproze.cfr_renamed_559(this.cfr_renamed_3.cfr_renamed_629(), sprjj2.cfr_renamed_580())) {
                throw new sprsff(sprqzz.cfr_renamed_9(":\n+\u001b0\t0\f8\u001b<O1\u000e*\u0007y\u000b6\n*O7\u0000-O4\u000e-\f1O:\n+\u001b\u0010+y\u00078\u001c1A"));
            }
            if (this.cfr_renamed_3.cfr_renamed_630() != null) {
                boolean bl;
                block14: {
                    int n;
                    sprdsm sprdsm2 = new sprdsm(sprtpl2.cfr_renamed_568());
                    if (!this.cfr_renamed_3.cfr_renamed_630().cfr_renamed_405().cfr_renamed_5078(sprdsm2.cfr_renamed_114())) {
                        throw new sprsff(sprxqy.cfr_renamed_9("B?S.H<H9@.DzR?S3@6\u00014T7C?SzE5D)\u00014N.\u00017@.B2\u00019D(U\u0013ezG5SzR3F4@.T(Dt"));
                    }
                    sprigm[] sprigmArray = this.cfr_renamed_3.cfr_renamed_630().cfr_renamed_102().cfr_renamed_289();
                    boolean bl2 = false;
                    int n2 = n = 0;
                    while (n2 != sprigmArray.length) {
                        if (sprigmArray[n].cfr_renamed_312() == 4 && sprnbm.cfr_renamed_23(sprigmArray[n].cfr_renamed_313()).equals(sprnbm.cfr_renamed_23(sprdsm2.cfr_renamed_313()))) {
                            bl = bl2 = true;
                            break block14;
                        }
                        n2 = ++n;
                    }
                    bl = bl2;
                }
                if (!bl) {
                    throw new sprsff(sprqzz.cfr_renamed_9(":\n+\u001b0\t0\f8\u001b<O7\u000e4\ny\u000b6\n*O7\u0000-O4\u000e-\f1O:\n+\u001b\u0010+y\t6\u001dy\u001c0\b7\u000e-\u001a+\nwO"));
                }
            }
            sprkye.cfr_renamed_5275(sprtpl2);
            if (!sprtpl2.cfr_renamed_631(this.cfr_renamed_4.cfr_renamed_588())) {
                throw new sprsff(sprxqy.cfr_renamed_9("B?S.H<H9@.DzO5UzW;M3EzV2D4\u0001.H7DzR.@7QzB(D;U?Et"));
            }
            if (!this.cfr_renamed_1.cfr_renamed_5296(arg0)) {
                throw new sprsff(sprqzz.cfr_renamed_9("\u001c0\b7\u000e-\u001a+\ny\u00016\u001by\f+\n8\u001b<\u000by\r O:\n+\u001b0\t0\f8\u001b<A"));
            }
        }
        catch (sprlyl sprlyl2) {
            if (sprlyl2.cfr_renamed_584() != null) {
                throw new sprahf(sprlyl2.getMessage(), sprlyl2.cfr_renamed_584());
            }
            throw new sprahf(new StringBuilder().insert(0, sprxqy.cfr_renamed_9("\u0019l\t\u0001?Y9D*U3N4\u001bz")).append(sprlyl2).toString(), sprlyl2);
        }
        catch (IOException iOException) {
            throw new sprahf(new StringBuilder().insert(0, sprqzz.cfr_renamed_9(")\u001d6\r5\n4O)\u001d6\f<\u001c*\u00067\by\f<\u001d-\u0006?\u0006:\u000e-\ncO")).append(iOException).toString(), iOException);
        }
        catch (sprhjg sprhjg2) {
            throw new sprahf(new StringBuilder().insert(0, sprxqy.cfr_renamed_9("/O;C6DzU5\u00019S?@.DzE3F?R.\u001bz")).append(sprhjg2.getMessage()).toString(), sprhjg2);
        }
    }

    public spridf cfr_renamed_577() {
        return this.cfr_renamed_4;
    }

    public sprjpm cfr_renamed_619() {
        return this.cfr_renamed_1.cfr_renamed_619();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqxe(sprywl sprywl2) throws sprahf, IOException {
        sprqxe sprqxe2 = this;
        sprqxe2.cfr_renamed_2 = sprywl2;
        if (!sprqxe2.cfr_renamed_2.cfr_renamed_620().equals(sprdl.cfr_renamed_1494.cfr_renamed_19())) {
            throw new sprsff(sprqzz.cfr_renamed_9("\u001a\u00007\u001b<\u0001-&7\t6O6\r3\n:\u001by\u00016\u001by\t6\u001dy\u000ey\u001b0\u0002<O*\u001b8\u0002)A"));
        }
        Collection<sprrpl> collection = this.cfr_renamed_2.cfr_renamed_621().cfr_renamed_622();
        if (collection.size() != 1) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxqy.cfr_renamed_9("\u000eH7DwR.@7QzU5J?OzR3F4D>\u00018Xz")).append(collection.size()).append(sprqzz.cfr_renamed_9("O*\u0006>\u0001<\u001d*Cy\r,\u001by\u0006-O4\u001a*\u001by\f6\u0001-\u000e0\u0001y\u0005,\u001c-O-\u0007<O\r<\u0018O*\u0006>\u00018\u001b,\u001d<A")).toString());
        }
        this.cfr_renamed_1 = collection.iterator().next();
        try {
            sprqxe sprqxe3 = this;
            sprsv sprsv2 = sprqxe3.cfr_renamed_2.cfr_renamed_623();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            sprsv2.cfr_renamed_624(byteArrayOutputStream);
            sprqxe sprqxe4 = this;
            sprqxe4.cfr_renamed_4 = new spridf(sprzhm.cfr_renamed_23(sprxgf.cfr_renamed_184(byteArrayOutputStream.toByteArray())));
            spruem spruem2 = sprqxe3.cfr_renamed_1.cfr_renamed_619().cfr_renamed_5299(sprdl.cfr_renamed_578);
            if (spruem2 != null) {
                sprmtm sprmtm2 = sprmtm.cfr_renamed_23(spruem2.cfr_renamed_206().cfr_renamed_85(0));
                this.cfr_renamed_3 = new sprghf(sprhum.cfr_renamed_23(sprmtm2.cfr_renamed_626()[0]));
                return;
            }
            spruem2 = this.cfr_renamed_1.cfr_renamed_619().cfr_renamed_5299(sprdl.cfr_renamed_1765);
            if (spruem2 == null) {
                throw new sprsff(sprxqy.cfr_renamed_9("4NzR3F4H4FzB?S.H<H9@.Dz@.U(H8T.DzG5T4Ev\u0001.H7DzR.@7QzH4W;M3Et"));
            }
            sprjqm sprjqm2 = sprjqm.cfr_renamed_23(spruem2.cfr_renamed_206().cfr_renamed_85(0));
            this.cfr_renamed_3 = new sprghf(spryqm.cfr_renamed_23(sprjqm2.cfr_renamed_626()[0]));
            return;
        }
        catch (sprlyl sprlyl2) {
            throw new sprahf(sprlyl2.getMessage(), sprlyl2.cfr_renamed_584());
        }
    }
}

