/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbse;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprdd;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.sprele;
import com.spire.presentation.packages.sprfue;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgwe;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjne;
import com.spire.presentation.packages.sprjxq;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprone;
import com.spire.presentation.packages.sprpme;
import com.spire.presentation.packages.sprppe;
import com.spire.presentation.packages.sprqlaa;
import com.spire.presentation.packages.sprsle;
import com.spire.presentation.packages.sprvle;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwue;
import com.spire.presentation.packages.sprxqe;
import com.spire.presentation.packages.sprxre;
import com.spire.presentation.packages.sprzre;
import com.spire.presentation.packages.sprzve;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprkwe {
    private final int cfr_renamed_2;
    private final InputStream cfr_renamed_3;
    private final byte[][] cfr_renamed_4;

    public spra cfr_renamed_4903(boolean arg0, int arg1) throws IOException {
        if (this.cfr_renamed_3 instanceof sprxre) {
            if (!arg0) {
                throw new IOException(sprjxq.cfr_renamed_9("\u0010(\u001d#\u001f/\u0017/\r#Y*\u001c(\u001e2\u0011f\t4\u0010+\u00102\u00100\u001cf\u001c(\u001a)\u001d/\u0017!Y#\u0017%\u00163\u00172\u001c4\u001c\""));
            }
            return this.cfr_renamed_4915(arg1);
        }
        if (arg0) {
            switch (arg1) {
                case 17: {
                    return new sprpme(this);
                }
                case 16: {
                    return new sprvle(this);
                }
                case 4: {
                    return new sprfue(this);
                }
            }
        } else {
            switch (arg1) {
                case 17: {
                    throw new sprwue(sprqlaa.cfr_renamed_9("A<C,W7Q<Ay_,A-\u0012,A<\u0012:]7A-@,Q-W=\u0012<\\:]=[7Uy\u001a*W<\u0012\u0001\u001co\u000bi\u0012a\u001c`\u001ch\u001da\u001ch\u0002w\u0003p"));
                }
                case 16: {
                    throw new sprwue(sprjxq.cfr_renamed_9("\n#\r5Y+\f5\rf\f5\u001cf\u001a)\u00175\r4\f%\r#\u001df\u001c(\u001a)\u001d/\u0017!Yn\n#\u001cf!hO\u007fIfAhHwWwV~WwKhHo"));
                }
                case 4: {
                    return new sprjne((sprzre)this.cfr_renamed_3);
                }
            }
        }
        throw new RuntimeException(sprqlaa.cfr_renamed_9("[4B5[:[-\u0012-S>U0\\>\u00127]-\u00120_)^<_<\\-W="));
    }

    public spra cfr_renamed_24() throws IOException {
        int n = this.cfr_renamed_3.read();
        if (n == -1) {
            return null;
        }
        sprkwe sprkwe2 = this;
        sprkwe2.cfr_renamed_4916(false);
        int n2 = sprgle.cfr_renamed_4917(sprkwe2.cfr_renamed_3, n);
        boolean bl = (n & 0x20) != 0;
        sprkwe sprkwe3 = this;
        int n3 = sprgle.cfr_renamed_4918(sprkwe3.cfr_renamed_3, sprkwe3.cfr_renamed_2);
        if (n3 < 0) {
            if (!bl) {
                throw new IOException(sprjxq.cfr_renamed_9("\u0010(\u001d#\u001f/\u0017/\r#Y*\u001c(\u001e2\u0011f\t4\u0010+\u00102\u00100\u001cf\u001c(\u001a)\u001d/\u0017!Y#\u0017%\u00163\u00172\u001c4\u001c\""));
            }
            sprkwe sprkwe4 = this;
            sprxre sprxre2 = new sprxre(sprkwe4.cfr_renamed_3, sprkwe4.cfr_renamed_2);
            sprkwe sprkwe5 = new sprkwe(sprxre2, this.cfr_renamed_2);
            if ((n & 0x40) != 0) {
                return new sprbse(n2, sprkwe5);
            }
            if ((n & 0x80) != 0) {
                return new sprppe(true, n2, sprkwe5);
            }
            return sprkwe5.cfr_renamed_4915(n2);
        }
        sprzre sprzre2 = new sprzre(this.cfr_renamed_3, n3);
        if ((n & 0x40) != 0) {
            return new sprgwe(bl, n2, sprzre2.cfr_renamed_954());
        }
        if ((n & 0x80) != 0) {
            return new sprppe(bl, n2, new sprkwe(sprzre2));
        }
        if (bl) {
            switch (n2) {
                case 4: {
                    return new sprfue(new sprkwe(sprzre2));
                }
                case 16: {
                    return new sprvle(new sprkwe(sprzre2));
                }
                case 17: {
                    return new sprpme(new sprkwe(sprzre2));
                }
                case 8: {
                    return new sprxqe(new sprkwe(sprzre2));
                }
            }
            throw new IOException(new StringBuilder().insert(0, sprqlaa.cfr_renamed_9("G7Y7].\\yF8Uy")).append(n2).append(sprjxq.cfr_renamed_9("Y#\u0017%\u00163\u00172\u001c4\u001c\"")).toString());
        }
        switch (n2) {
            case 4: {
                return new sprjne(sprzre2);
            }
        }
        try {
            return sprgle.cfr_renamed_4919(n2, sprzre2, this.cfr_renamed_4);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprwue(sprqlaa.cfr_renamed_9(":]+@,B-W=\u0012*F+W8_yV<F<Q-W="), illegalArgumentException);
        }
    }

    public sprvva cfr_renamed_4904(boolean arg0, int arg1) throws IOException {
        if (!arg0) {
            sprzre sprzre2 = (sprzre)this.cfr_renamed_3;
            return new sprhse(false, arg1, new sprlqe(sprzre2.cfr_renamed_954()));
        }
        sprkwe sprkwe2 = this;
        sprlre sprlre2 = sprkwe2.cfr_renamed_4789();
        if (sprkwe2.cfr_renamed_3 instanceof sprxre) {
            if (sprlre2.cfr_renamed_84() == 1) {
                return new sprdpe(true, arg1, sprlre2.cfr_renamed_576(0));
            }
            return new sprdpe(false, arg1, sprele.cfr_renamed_4798(sprlre2));
        }
        if (sprlre2.cfr_renamed_84() == 1) {
            return new sprhse(true, arg1, sprlre2.cfr_renamed_576(0));
        }
        return new sprhse(false, arg1, sprzve.cfr_renamed_4798(sprlre2));
    }

    public sprkwe(InputStream arg0) {
        InputStream inputStream = arg0;
        this(inputStream, sprcme.cfr_renamed_4582(inputStream));
    }

    /*
     * WARNING - void declaration
     */
    public sprkwe(InputStream inputStream, int n) {
        void arg1;
        void arg0;
        sprkwe sprkwe2 = this;
        this.cfr_renamed_3 = arg0;
        sprkwe2.cfr_renamed_2 = arg1;
        sprkwe2.cfr_renamed_4 = new byte[11][];
    }

    public sprlre cfr_renamed_4789() throws IOException {
        spra spra2;
        sprlre sprlre2 = new sprlre();
        sprkwe sprkwe2 = this;
        while ((spra2 = sprkwe2.cfr_renamed_24()) != null) {
            if (spra2 instanceof sprdd) {
                sprlre2.cfr_renamed_49(((sprdd)((Object)spra2)).cfr_renamed_2414());
                sprkwe2 = this;
                continue;
            }
            sprlre2.cfr_renamed_49(spra2.cfr_renamed_119());
            sprkwe2 = this;
        }
        return sprlre2;
    }

    public spra cfr_renamed_4915(int arg0) throws IOException {
        switch (arg0) {
            case 8: {
                return new sprxqe(this);
            }
            case 4: {
                return new sprfue(this);
            }
            case 16: {
                return new sprsle(this);
            }
            case 17: {
                return new sprone(this);
            }
        }
        throw new sprwue(new StringBuilder().insert(0, sprjxq.cfr_renamed_9("\f(\u0012(\u00161\u0017f;\u0003+f\u0016$\u0013#\u001a2Y#\u0017%\u00163\u00172\u001c4\u001c\"CfI>")).append(Integer.toHexString(arg0)).toString());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 4;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 4 << 4;
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
     * WARNING - void declaration
     */
    public sprkwe(byte[] byArray) {
        this(new ByteArrayInputStream((byte[])arg0), ((void)arg0).length);
        void arg0;
    }

    private /* synthetic */ void cfr_renamed_4916(boolean arg0) {
        if (this.cfr_renamed_3 instanceof sprxre) {
            ((sprxre)this.cfr_renamed_3).cfr_renamed_4610(arg0);
        }
    }
}

