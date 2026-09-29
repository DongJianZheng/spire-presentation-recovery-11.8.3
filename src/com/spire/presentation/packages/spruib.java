/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbqe;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprinq;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sproke;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqje;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprsde;
import com.spire.presentation.packages.sprsey;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class spruib
extends sprkra {
    private Vector cfr_renamed_134;
    public static boolean cfr_renamed_954;
    public static final sprtzd cfr_renamed_805;
    public static final Hashtable cfr_renamed_131;
    public static final sprtzd cfr_renamed_722;
    public static final sprtzd cfr_renamed_955;
    public static final sprtzd cfr_renamed_1228;
    public static final sprtzd cfr_renamed_1260;
    public static final Hashtable cfr_renamed_499;
    private static final Boolean cfr_renamed_135;
    public static final sprtzd cfr_renamed_956;
    public static final sprtzd cfr_renamed_952;
    private static final Boolean cfr_renamed_728;
    public static final sprtzd cfr_renamed_128;
    public static final sprtzd cfr_renamed_957;
    private sprqje cfr_renamed_314;
    private boolean cfr_renamed_951;
    public static final sprtzd cfr_renamed_84;
    public static final sprtzd cfr_renamed_723;
    public static final sprtzd cfr_renamed_1226;
    public static final sprtzd cfr_renamed_287;
    public static final sprtzd cfr_renamed_724;
    public static final sprtzd cfr_renamed_953;
    private Vector cfr_renamed_133;
    public static final sprtzd cfr_renamed_185;
    public static final sprtzd spr\ufe34;
    public static final sprtzd cfr_renamed_82;
    public static final Hashtable cfr_renamed_126;
    public static final sprtzd cfr_renamed_88;
    public static final sprtzd cfr_renamed_31;
    public static final sprtzd cfr_renamed_272;
    private Vector cfr_renamed_145;
    public static final sprtzd cfr_renamed_114;
    public static final sprtzd cfr_renamed_96;
    public static final sprtzd cfr_renamed_105;
    public static final Hashtable cfr_renamed_137;
    public static final sprtzd cfr_renamed_79;
    public static final Hashtable cfr_renamed_107;
    private int cfr_renamed_132;
    public static final sprtzd cfr_renamed_102;
    public static final sprtzd cfr_renamed_93;
    public static final sprtzd cfr_renamed_86;
    public static final sprtzd cfr_renamed_152;
    public static final Hashtable cfr_renamed_112;
    private sprbne cfr_renamed_119;
    public static final sprtzd cfr_renamed_91;
    public static final sprtzd cfr_renamed_0;
    public static final sprtzd cfr_renamed_1;
    public static final sprtzd cfr_renamed_2;
    public static final sprtzd cfr_renamed_3;
    public static final sprtzd cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprvva cfr_renamed_4450(String arg0) {
        try {
            return sprvva.cfr_renamed_184(sprmma.cfr_renamed_488(arg0.substring(1)));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprsey.cfr_renamed_9("[&E&A?@hK&M'J!@/\u000e!@h@)C-\u0014h")).append(iOException).toString());
        }
    }

    public spruib(sprbne arg0) {
        spruib spruib2 = this;
        this.cfr_renamed_314 = null;
        spruib spruib3 = this;
        spruib2.cfr_renamed_134 = new Vector();
        spruib3.cfr_renamed_133 = new Vector();
        spruib2.cfr_renamed_145 = new Vector();
        this.cfr_renamed_119 = arg0;
        Enumeration enumeration = this.cfr_renamed_119.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            int n;
            sprere sprere2 = sprere.cfr_renamed_23(((spra)enumeration.nextElement()).cfr_renamed_119());
            int n2 = n = 0;
            while (n2 < sprere2.cfr_renamed_84()) {
                spruib spruib4;
                sprbne sprbne2 = sprbne.cfr_renamed_23(sprere2.cfr_renamed_85(n).cfr_renamed_119());
                if (sprbne2.cfr_renamed_84() != 2) {
                    throw new IllegalArgumentException(sprinq.cfr_renamed_9("~/x\"eno'f+xnl/u<"));
                }
                this.cfr_renamed_134.addElement(sprtzd.cfr_renamed_23(sprbne2.cfr_renamed_85(0)));
                spra spra2 = sprbne2.cfr_renamed_85(1);
                if (!(spra2 instanceof sprx) || spra2 instanceof sprbqe) {
                    try {
                        this.cfr_renamed_133.addElement(new StringBuilder().insert(0, "#").append(this.cfr_renamed_4451(sprmma.cfr_renamed_485(spra2.cfr_renamed_119().cfr_renamed_104("DER")))).toString());
                        spruib4 = this;
                    }
                    catch (IOException iOException) {
                        throw new IllegalArgumentException(sprsey.cfr_renamed_9("+O&@'ZhK&M'J-\u000e>O$[-"));
                    }
                } else {
                    String string = ((sprx)((Object)spra2)).cfr_renamed_314();
                    if (string.length() > 0 && string.charAt(0) == '#') {
                        this.cfr_renamed_133.addElement(new StringBuilder().insert(0, "\\").append(string).toString());
                    } else {
                        this.cfr_renamed_133.addElement(string);
                    }
                    spruib4 = this;
                }
                spruib4.cfr_renamed_145.addElement(n != 0 ? cfr_renamed_728 : cfr_renamed_135);
                n2 = ++n;
            }
        }
    }

    public spruib(Vector arg0, Vector arg1) {
        this(arg0, arg1, (sprqje)new sprsde());
    }

    public spruib(boolean arg0, Hashtable arg1, String arg2) {
        this(arg0, arg1, arg2, new sprsde());
    }

    public boolean cfr_renamed_4452(Object arg0, boolean arg1) {
        int n;
        spruib spruib2;
        if (!arg1) {
            return this.equals(arg0);
        }
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof spruib) && !(arg0 instanceof sprbne)) {
            return false;
        }
        sprvva sprvva2 = ((spra)arg0).cfr_renamed_119();
        if (this.cfr_renamed_119().equals(sprvva2)) {
            return true;
        }
        try {
            spruib2 = spruib.cfr_renamed_23(arg0);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
        int n2 = this.cfr_renamed_134.size();
        if (n2 != spruib2.cfr_renamed_134.size()) {
            return false;
        }
        int n3 = n = 0;
        while (n3 < n2) {
            sprtzd sprtzd2;
            sprtzd sprtzd3 = (sprtzd)this.cfr_renamed_134.elementAt(n);
            if (sprtzd3.equals(sprtzd2 = (sprtzd)spruib2.cfr_renamed_134.elementAt(n))) {
                String string;
                String string2 = (String)this.cfr_renamed_133.elementAt(n);
                if (!this.cfr_renamed_4453(string2, string = (String)spruib2.cfr_renamed_133.elementAt(n))) {
                    return false;
                }
            } else {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    static {
        cfr_renamed_0 = new sprtzd(sprinq.cfr_renamed_9("|2{2z2x"));
        cfr_renamed_952 = new sprtzd(sprsey.cfr_renamed_9("\u001cf\u001bf\u001af\u001fx"));
        cfr_renamed_1 = new sprtzd(sprinq.cfr_renamed_9(".`)`(`-\u007f"));
        cfr_renamed_128 = new sprtzd(sprsey.cfr_renamed_9("\u001cf\u001bf\u001af\u001fz"));
        cfr_renamed_185 = new sprtzd(sprinq.cfr_renamed_9("|2{2z2}"));
        cfr_renamed_86 = new sprtzd(sprsey.cfr_renamed_9("z\u0000}\u0000|\u0000}"));
        cfr_renamed_79 = new sprtzd(sprinq.cfr_renamed_9("|2{2z2w"));
        cfr_renamed_955 = cfr_renamed_86;
        cfr_renamed_105 = new sprtzd(sprsey.cfr_renamed_9("z\u0000}\u0000|\u0000\u007f"));
        cfr_renamed_1226 = new sprtzd(sprinq.cfr_renamed_9("|2{2z2v"));
        cfr_renamed_114 = new sprtzd(sprsey.cfr_renamed_9("z\u0000}\u0000|\u0000|"));
        cfr_renamed_4 = new sprtzd(sprinq.cfr_renamed_9(".`)`(`(|"));
        cfr_renamed_88 = new sprtzd(sprsey.cfr_renamed_9("\u001cf\u001bf\u001af\u001a{"));
        cfr_renamed_152 = new sprtzd(sprinq.cfr_renamed_9(".`)`(`(z"));
        cfr_renamed_3 = new sprtzd(sprsey.cfr_renamed_9("\u001cf\u001bf\u001af\u001a}"));
        cfr_renamed_2 = new sprtzd(sprinq.cfr_renamed_9(".`)`(`-{"));
        cfr_renamed_723 = new sprtzd(sprsey.cfr_renamed_9("\u001cf\u001bf\u001af\u001f\u007f"));
        cfr_renamed_956 = new sprtzd(sprinq.cfr_renamed_9(".`)`(`(x"));
        cfr_renamed_1228 = new sprtzd(sprsey.cfr_renamed_9("\u001cf\u001bf\u001af\u0018}"));
        cfr_renamed_805 = new sprtzd(sprinq.cfr_renamed_9("\u007f2}2x2\u007f2{2{2y2w2\u007f"));
        cfr_renamed_82 = new sprtzd(sprsey.cfr_renamed_9("y\u0000{\u0000~\u0000y\u0000}\u0000}\u0000\u007f\u0000q\u0000z"));
        cfr_renamed_1260 = new sprtzd(sprinq.cfr_renamed_9("\u007f2}2x2\u007f2{2{2y2w2}"));
        spr\ufe34 = new sprtzd(sprsey.cfr_renamed_9("y\u0000{\u0000~\u0000y\u0000}\u0000}\u0000\u007f\u0000q\u0000|"));
        cfr_renamed_84 = new sprtzd(sprinq.cfr_renamed_9("\u007f2}2x2\u007f2{2{2y2w2{"));
        cfr_renamed_953 = new sprtzd(sprsey.cfr_renamed_9("y\u0000{\u0000{\u0018f\u0016f\u001df\u001f|"));
        cfr_renamed_102 = new sprtzd(sprinq.cfr_renamed_9(".`)`(`-x"));
        cfr_renamed_91 = new sprtzd(sprsey.cfr_renamed_9("\u001cf\u001bf\u001af\u001b|"));
        cfr_renamed_724 = sprs.cfr_renamed_624;
        cfr_renamed_93 = sprs.cfr_renamed_1765;
        cfr_renamed_272 = sprm.cfr_renamed_136;
        cfr_renamed_287 = sprm.cfr_renamed_31;
        cfr_renamed_31 = sprm.cfr_renamed_2888;
        cfr_renamed_96 = cfr_renamed_272;
        cfr_renamed_722 = new sprtzd(sprinq.cfr_renamed_9(",`%`.}(|2\u007f%|,~/~,`-~,`-`.{"));
        cfr_renamed_957 = new sprtzd(sprsey.cfr_renamed_9("x\u0000q\u0000z\u001d|\u001cf\u001fq\u001cx\u001e{\u001ex\u0000y\u001ex\u0000y\u0000y"));
        cfr_renamed_954 = false;
        cfr_renamed_126 = new Hashtable();
        cfr_renamed_112 = new Hashtable();
        cfr_renamed_137 = new Hashtable();
        cfr_renamed_499 = new Hashtable();
        cfr_renamed_107 = cfr_renamed_126;
        cfr_renamed_131 = cfr_renamed_499;
        cfr_renamed_728 = new Boolean(true);
        cfr_renamed_135 = new Boolean(false);
        cfr_renamed_126.put(cfr_renamed_0, sprinq.cfr_renamed_9("\r"));
        cfr_renamed_126.put(cfr_renamed_952, sprsey.cfr_renamed_9("\u0007"));
        cfr_renamed_126.put(cfr_renamed_128, sprinq.cfr_renamed_9("\u001a"));
        cfr_renamed_126.put(cfr_renamed_1, sprsey.cfr_renamed_9("a\u001d"));
        cfr_renamed_126.put(cfr_renamed_185, sprinq.cfr_renamed_9("_\u0000"));
        cfr_renamed_126.put(cfr_renamed_105, sprsey.cfr_renamed_9("\u0004"));
        cfr_renamed_126.put(cfr_renamed_1226, sprinq.cfr_renamed_9("O\u001a"));
        cfr_renamed_126.put(cfr_renamed_86, sprsey.cfr_renamed_9("}\r|\u0001o\u0004`\u001dc\nk\u001a"));
        cfr_renamed_126.put(cfr_renamed_272, sprinq.cfr_renamed_9("\u000b"));
        cfr_renamed_126.put(cfr_renamed_722, sprsey.cfr_renamed_9("j\u000b"));
        cfr_renamed_126.put(cfr_renamed_957, sprinq.cfr_renamed_9("\u001bU\n"));
        cfr_renamed_126.put(cfr_renamed_79, sprsey.cfr_renamed_9("}\u001c|\rk\u001c"));
        cfr_renamed_126.put(cfr_renamed_114, sprinq.cfr_renamed_9("\u001dI\u001cR\u000fQ\u000b"));
        cfr_renamed_126.put(cfr_renamed_4, sprsey.cfr_renamed_9("\u000fg\u001ek\u0006`\tc\r"));
        cfr_renamed_126.put(cfr_renamed_88, sprinq.cfr_renamed_9("U\u0000U\u001aU\u000fP\u001d"));
        cfr_renamed_126.put(cfr_renamed_152, sprsey.cfr_renamed_9("i\r`\r|\tz\u0001a\u0006"));
        cfr_renamed_126.put(cfr_renamed_31, sprinq.cfr_renamed_9(";r=h<i-h;n+x\u000fx*n+o="));
        cfr_renamed_126.put(cfr_renamed_287, sprsey.cfr_renamed_9("[&]<\\=M<[:K,`)C-"));
        cfr_renamed_126.put(cfr_renamed_3, sprinq.cfr_renamed_9("I u?i+U*y h'z'y<"));
        cfr_renamed_126.put(cfr_renamed_956, sprsey.cfr_renamed_9("j\u0006"));
        cfr_renamed_126.put(cfr_renamed_1228, sprinq.cfr_renamed_9("\u001eo+i*s e#"));
        cfr_renamed_126.put(cfr_renamed_102, sprsey.cfr_renamed_9("\u0018A;Z)B\tJ,\\-];"));
        cfr_renamed_126.put(cfr_renamed_953, sprinq.cfr_renamed_9("\u0000}#y\u000fh\fu<h&"));
        cfr_renamed_126.put(spr\ufe34, sprsey.cfr_renamed_9("m'[&Z:W\u0007H\u000bG<G2K&] G8"));
        cfr_renamed_126.put(cfr_renamed_84, sprinq.cfr_renamed_9("_!i h<e\u0001z\u001cy=u*y \u007f+"));
        cfr_renamed_126.put(cfr_renamed_1260, sprsey.cfr_renamed_9("i-@,K:"));
        cfr_renamed_126.put(cfr_renamed_82, sprinq.cfr_renamed_9("L\"}-y\u0001z\fu<h&"));
        cfr_renamed_126.put(cfr_renamed_805, sprsey.cfr_renamed_9("\fO<K\u0007H\nG:Z "));
        cfr_renamed_126.put(cfr_renamed_723, sprinq.cfr_renamed_9("L!o:}\"_!x+"));
        cfr_renamed_126.put(cfr_renamed_2, sprsey.cfr_renamed_9("l=]!@-];m)Z-I'\\1"));
        cfr_renamed_126.put(cfr_renamed_724, sprinq.cfr_renamed_9("\u001ay\"y>t!r+R;q,y<"));
        cfr_renamed_126.put(cfr_renamed_93, "Name");
        cfr_renamed_112.put(cfr_renamed_0, sprsey.cfr_renamed_9("\u000b"));
        cfr_renamed_112.put(cfr_renamed_952, sprinq.cfr_renamed_9("\u0001"));
        cfr_renamed_112.put(cfr_renamed_1, sprsey.cfr_renamed_9("a\u001d"));
        cfr_renamed_112.put(cfr_renamed_185, sprinq.cfr_renamed_9("_\u0000"));
        cfr_renamed_112.put(cfr_renamed_105, sprsey.cfr_renamed_9("\u0004"));
        cfr_renamed_112.put(cfr_renamed_1226, sprinq.cfr_renamed_9("O\u001a"));
        cfr_renamed_112.put(cfr_renamed_79, sprsey.cfr_renamed_9("}\u001c|\rk\u001c"));
        cfr_renamed_112.put(cfr_renamed_722, sprinq.cfr_renamed_9("X\r"));
        cfr_renamed_112.put(cfr_renamed_957, sprsey.cfr_renamed_9("\u001dg\f"));
        cfr_renamed_137.put(cfr_renamed_0, sprinq.cfr_renamed_9("\r"));
        cfr_renamed_137.put(cfr_renamed_952, sprsey.cfr_renamed_9("\u0007"));
        cfr_renamed_137.put(cfr_renamed_1, sprinq.cfr_renamed_9("S\u001b"));
        cfr_renamed_137.put(cfr_renamed_185, sprsey.cfr_renamed_9("m\u0006"));
        cfr_renamed_137.put(cfr_renamed_105, sprinq.cfr_renamed_9("\u0002"));
        cfr_renamed_137.put(cfr_renamed_1226, sprsey.cfr_renamed_9("}\u001c"));
        cfr_renamed_137.put(cfr_renamed_79, sprinq.cfr_renamed_9("O\u001aN\u000bY\u001a"));
        cfr_renamed_499.put("c", cfr_renamed_0);
        cfr_renamed_499.put("o", cfr_renamed_952);
        cfr_renamed_499.put("t", cfr_renamed_128);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("A="), cfr_renamed_1);
        cfr_renamed_499.put("cn", cfr_renamed_185);
        cfr_renamed_499.put("l", cfr_renamed_105);
        cfr_renamed_499.put("st", cfr_renamed_1226);
        cfr_renamed_499.put(sprinq.cfr_renamed_9("o "), cfr_renamed_86);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("]-\\!O$@=C*K:"), cfr_renamed_86);
        cfr_renamed_499.put(sprinq.cfr_renamed_9("o:n+y:"), cfr_renamed_79);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("K%O!B)J,\\-];"), cfr_renamed_96);
        cfr_renamed_499.put(sprinq.cfr_renamed_9("x-"), cfr_renamed_722);
        cfr_renamed_499.put("e", cfr_renamed_96);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("=G,"), cfr_renamed_957);
        cfr_renamed_499.put(sprinq.cfr_renamed_9("=i<r/q+"), cfr_renamed_114);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("/G>K&@)C-"), cfr_renamed_4);
        cfr_renamed_499.put("initials", cfr_renamed_88);
        cfr_renamed_499.put(sprinq.cfr_renamed_9("{+r+n/h's "), cfr_renamed_152);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("=@;Z:[+Z=\\-J)J,\\-];"), cfr_renamed_31);
        cfr_renamed_499.put(sprinq.cfr_renamed_9("i o:n;\u007f:i<y*r/q+"), cfr_renamed_287);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("[&G9[-G,K&Z!H!K:"), cfr_renamed_3);
        cfr_renamed_499.put("dn", cfr_renamed_956);
        cfr_renamed_499.put(sprinq.cfr_renamed_9(">o+i*s e#"), cfr_renamed_1228);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("8A;Z)B)J,\\-];"), cfr_renamed_102);
        cfr_renamed_499.put(sprinq.cfr_renamed_9(" }#y!z,u<h&"), cfr_renamed_953);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("M'[&Z:W'H+G<G2K&] G8"), spr\ufe34);
        cfr_renamed_499.put(sprinq.cfr_renamed_9("\u007f!i h<e!z<y=u*y \u007f+"), cfr_renamed_84);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("I-@,K:"), cfr_renamed_1260);
        cfr_renamed_499.put(sprinq.cfr_renamed_9("l\"}-y!z,u<h&"), cfr_renamed_82);
        cfr_renamed_499.put(sprsey.cfr_renamed_9(",O<K'H*G:Z "), cfr_renamed_805);
        cfr_renamed_499.put(sprinq.cfr_renamed_9("l!o:}\"\u007f!x+"), cfr_renamed_723);
        cfr_renamed_499.put(sprsey.cfr_renamed_9("L=]!@-];M)Z-I'\\1"), cfr_renamed_2);
        cfr_renamed_499.put(sprinq.cfr_renamed_9(":y\"y>t!r+r;q,y<"), cfr_renamed_724);
        cfr_renamed_499.put("name", cfr_renamed_93);
    }

    /*
     * WARNING - void declaration
     */
    public spruib(Vector vector, Hashtable hashtable, sprqje sprqje2) {
        void arg1;
        int n;
        void arg2;
        spruib spruib2 = this;
        this.cfr_renamed_314 = null;
        spruib spruib3 = this;
        this.cfr_renamed_134 = new Vector();
        spruib2.cfr_renamed_133 = new Vector();
        spruib2.cfr_renamed_145 = new Vector();
        spruib2.cfr_renamed_314 = arg2;
        if (vector != null) {
            void arg0;
            int n2 = n = 0;
            while (n2 != arg0.size()) {
                spruib spruib4 = this;
                spruib4.cfr_renamed_134.addElement(arg0.elementAt(n));
                spruib4.cfr_renamed_145.addElement(cfr_renamed_135);
                n2 = ++n;
            }
        } else {
            Enumeration enumeration;
            Enumeration enumeration2 = enumeration = arg1.keys();
            while (enumeration2.hasMoreElements()) {
                spruib spruib5 = this;
                Enumeration enumeration3 = enumeration;
                enumeration2 = enumeration3;
                spruib5.cfr_renamed_134.addElement(enumeration3.nextElement());
                spruib5.cfr_renamed_145.addElement(cfr_renamed_135);
            }
        }
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_134.size()) {
            sprtzd sprtzd2 = (sprtzd)this.cfr_renamed_134.elementAt(n);
            if (arg1.get(sprtzd2) == null) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprsey.cfr_renamed_9("\u0006AhO<Z:G*[<KhH'\\hA*D-M<\u000e!Jh\u0003h")).append(sprtzd2.cfr_renamed_19()).append(sprinq.cfr_renamed_9("n1nl/o=y*<:snx'o:u {;u=t+xnr/q+")).toString());
            }
            this.cfr_renamed_133.addElement(arg1.get(sprtzd2));
            n3 = ++n;
        }
    }

    public String toString() {
        return this.cfr_renamed_4454(cfr_renamed_954, cfr_renamed_126);
    }

    private /* synthetic */ String cfr_renamed_4455(String arg0) {
        int n;
        if (arg0.length() == 0 || arg0.indexOf(92) < 0 && arg0.indexOf(34) < 0) {
            return arg0.trim();
        }
        char[] cArray = arg0.toCharArray();
        boolean bl = false;
        boolean bl2 = false;
        StringBuffer stringBuffer = new StringBuffer(arg0.length());
        int n2 = 0;
        if (cArray[0] == '\\' && cArray[1] == '#') {
            n2 = 2;
            stringBuffer.append(sprsey.cfr_renamed_9("rk"));
        }
        boolean bl3 = false;
        int n3 = 0;
        int n4 = n = n2;
        while (n4 != cArray.length) {
            char c = cArray[n];
            if (c != ' ') {
                bl3 = true;
            }
            if (c == '\"') {
                if (!bl) {
                    bl2 = !bl2;
                } else {
                    stringBuffer.append(c);
                }
                bl = false;
            } else if (c == '\\' && !bl && !bl2) {
                bl = true;
                n3 = stringBuffer.length();
            } else if (c != ' ' || bl || bl3) {
                stringBuffer.append(c);
                bl = false;
            }
            n4 = ++n;
        }
        if (stringBuffer.length() > 0) {
            StringBuffer stringBuffer2 = stringBuffer;
            while (stringBuffer2.charAt(stringBuffer.length() - 1) == ' ' && n3 != stringBuffer.length() - 1) {
                StringBuffer stringBuffer3 = stringBuffer;
                stringBuffer2 = stringBuffer3;
                stringBuffer3.setLength(stringBuffer3.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public spruib() {
        spruib spruib2 = this;
        this.cfr_renamed_314 = null;
        spruib spruib3 = this;
        spruib2.cfr_renamed_134 = new Vector();
        spruib3.cfr_renamed_133 = new Vector();
        spruib2.cfr_renamed_145 = new Vector();
    }

    private /* synthetic */ String cfr_renamed_4456(String arg0) {
        sprvva sprvva2;
        String string = sprywa.cfr_renamed_425(arg0.trim());
        if (string.length() > 0 && string.charAt(0) == '#' && (sprvva2 = this.cfr_renamed_4450(string)) instanceof sprx) {
            string = sprywa.cfr_renamed_425(((sprx)((Object)sprvva2)).cfr_renamed_314().trim());
        }
        return string;
    }

    public spruib(boolean arg0, String arg1) {
        this(arg0, cfr_renamed_499, arg1);
    }

    public spruib(String arg0, sprqje arg1) {
        this(cfr_renamed_954, cfr_renamed_499, arg0, arg1);
    }

    public spruib(Hashtable arg0) {
        this(null, arg0);
    }

    private /* synthetic */ boolean cfr_renamed_4453(String arg0, String arg1) {
        String string;
        spruib spruib2 = this;
        String string2 = spruib2.cfr_renamed_4456(arg0);
        if (!string2.equals(string = spruib2.cfr_renamed_4456(arg1))) {
            spruib spruib3 = this;
            if (!(string2 = spruib3.cfr_renamed_4457(string2)).equals(string = spruib3.cfr_renamed_4457(string))) {
                return false;
            }
        }
        return true;
    }

    public spruib(boolean arg0, String arg1, sprqje arg2) {
        this(arg0, cfr_renamed_499, arg1, arg2);
    }

    public spruib(String arg0) {
        this(cfr_renamed_954, cfr_renamed_499, arg0);
    }

    public spruib(Vector arg0, Hashtable arg1) {
        this(arg0, arg1, (sprqje)new sprsde());
    }

    @Override
    public int hashCode() {
        int n;
        if (this.cfr_renamed_951) {
            return this.cfr_renamed_132;
        }
        this.cfr_renamed_951 = true;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_134.size()) {
            String string = (String)this.cfr_renamed_133.elementAt(n);
            spruib spruib2 = this;
            string = spruib2.cfr_renamed_4456(string);
            string = spruib2.cfr_renamed_4457(string);
            spruib2.cfr_renamed_132 ^= this.cfr_renamed_134.elementAt(n).hashCode();
            spruib2.cfr_renamed_132 ^= string.hashCode();
            n2 = ++n;
        }
        return this.cfr_renamed_132;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_4458(StringBuffer arg0, Hashtable arg1, sprtzd arg2, String arg3) {
        StringBuffer stringBuffer;
        String string = (String)arg1.get(arg2);
        if (string != null) {
            StringBuffer stringBuffer2 = arg0;
            stringBuffer = stringBuffer2;
            stringBuffer2.append(string);
        } else {
            StringBuffer stringBuffer3 = arg0;
            stringBuffer = stringBuffer3;
            stringBuffer3.append(arg2.cfr_renamed_19());
        }
        stringBuffer.append('=');
        StringBuffer stringBuffer4 = arg0;
        int n = stringBuffer4.length();
        stringBuffer4.append(arg3);
        int n2 = arg0.length();
        if (arg3.length() >= 2 && arg3.charAt(0) == '\\' && arg3.charAt(1) == '#') {
            n += 2;
        }
        int n3 = n;
        while (n3 < n2 && arg0.charAt(n) == ' ') {
            int n4 = n;
            arg0.insert(n4, "\\");
            ++n2;
            n3 = n += 2;
        }
        while (--n2 > n && arg0.charAt(n2) == ' ') {
            arg0.insert(n2, '\\');
        }
        int n5 = n;
        block5: while (n5 <= n2) {
            switch (arg0.charAt(n)) {
                case '\"': 
                case '+': 
                case ',': 
                case ';': 
                case '<': 
                case '=': 
                case '>': 
                case '\\': {
                    int n6 = n;
                    arg0.insert(n6, "\\");
                    ++n2;
                    n5 = n += 2;
                    continue block5;
                }
            }
            n5 = ++n;
        }
        return;
    }

    public static spruib cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spruib) {
            return (spruib)arg0;
        }
        if (arg0 instanceof spruhe) {
            return new spruib(sprbne.cfr_renamed_23(((spruhe)arg0).cfr_renamed_119()));
        }
        if (arg0 != null) {
            return new spruib(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public Vector cfr_renamed_2188(sprtzd arg0) {
        int n;
        Vector<String> vector = new Vector<String>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_133.size()) {
            if (this.cfr_renamed_134.elementAt(n).equals(arg0)) {
                String string = (String)this.cfr_renamed_133.elementAt(n);
                if (string.length() > 2 && string.charAt(0) == '\\' && string.charAt(1) == '#') {
                    vector.addElement(string.substring(1));
                } else {
                    vector.addElement(string);
                }
            }
            n2 = ++n;
        }
        return vector;
    }

    public Vector cfr_renamed_205() {
        int n;
        Vector vector = new Vector();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_133.size()) {
            vector.addElement(this.cfr_renamed_133.elementAt(n++));
            n2 = n;
        }
        return vector;
    }

    public static spruib cfr_renamed_341(spryte arg0, boolean arg1) {
        return spruib.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    private /* synthetic */ String cfr_renamed_4451(byte[] arg0) {
        int n;
        char[] cArray = new char[arg0.length];
        int n2 = n = 0;
        while (n2 != cArray.length) {
            int n3 = n++;
            cArray[n3] = (char)(arg0[n3] & 0xFF);
            n2 = n;
        }
        return new String(cArray);
    }

    public String cfr_renamed_4454(boolean arg0, Hashtable arg1) {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        Vector<StringBuffer> vector = new Vector<StringBuffer>();
        boolean bl = true;
        StringBuffer stringBuffer2 = null;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_134.size()) {
            if (((Boolean)this.cfr_renamed_145.elementAt(n)).booleanValue()) {
                StringBuffer stringBuffer3 = stringBuffer2;
                stringBuffer3.append('+');
                spruib spruib2 = this;
                spruib2.cfr_renamed_4458(stringBuffer3, arg1, (sprtzd)spruib2.cfr_renamed_134.elementAt(n), (String)this.cfr_renamed_133.elementAt(n));
            } else {
                stringBuffer2 = new StringBuffer();
                spruib spruib3 = this;
                spruib3.cfr_renamed_4458(stringBuffer2, arg1, (sprtzd)spruib3.cfr_renamed_134.elementAt(n), (String)this.cfr_renamed_133.elementAt(n));
                vector.addElement(stringBuffer2);
            }
            n2 = ++n;
        }
        if (arg0) {
            int n3 = n = vector.size() - 1;
            while (n3 >= 0) {
                StringBuffer stringBuffer4;
                if (bl) {
                    bl = false;
                    stringBuffer4 = stringBuffer;
                } else {
                    StringBuffer stringBuffer5 = stringBuffer;
                    stringBuffer4 = stringBuffer5;
                    stringBuffer5.append(',');
                }
                stringBuffer4.append(vector.elementAt(n--).toString());
                n3 = n;
            }
        } else {
            int n4 = n = 0;
            while (n4 < vector.size()) {
                StringBuffer stringBuffer6;
                if (bl) {
                    bl = false;
                    stringBuffer6 = stringBuffer;
                } else {
                    StringBuffer stringBuffer7 = stringBuffer;
                    stringBuffer6 = stringBuffer7;
                    stringBuffer7.append(',');
                }
                stringBuffer6.append(vector.elementAt(n++).toString());
                n4 = n;
            }
        }
        return stringBuffer.toString();
    }

    /*
     * WARNING - void declaration
     */
    public spruib(Vector vector, Vector vector2, sprqje sprqje2) {
        void arg0;
        int n;
        void arg1;
        void arg2;
        spruib spruib2 = this;
        this.cfr_renamed_314 = null;
        spruib spruib3 = this;
        this.cfr_renamed_134 = new Vector();
        spruib2.cfr_renamed_133 = new Vector();
        spruib2.cfr_renamed_145 = new Vector();
        spruib2.cfr_renamed_314 = arg2;
        if (vector.size() != arg1.size()) {
            throw new IllegalArgumentException(sprinq.cfr_renamed_9("s'x=<8y-h!nnq;o:<,yno/q+<\"y {:tn}=<8}\"i+o`"));
        }
        int n2 = n = 0;
        while (n2 < arg0.size()) {
            spruib spruib4 = this;
            spruib4.cfr_renamed_134.addElement(arg0.elementAt(n));
            spruib4.cfr_renamed_133.addElement(arg1.elementAt(n));
            spruib4.cfr_renamed_145.addElement(cfr_renamed_135);
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_4459(Hashtable arg0, String arg1, Boolean arg2) {
        sproke sproke2 = new sproke(arg1, '=');
        String string = sproke2.cfr_renamed_4445();
        if (!sproke2.cfr_renamed_4444()) {
            throw new IllegalArgumentException(sprsey.cfr_renamed_9("L)J$WhH'\\%O<Z-JhJ!\\-M<A:Wh]<\\!@/"));
        }
        String string2 = sproke2.cfr_renamed_4445();
        spruib spruib2 = this;
        sprtzd sprtzd2 = spruib2.cfr_renamed_4460(string, arg0);
        spruib2.cfr_renamed_134.addElement(sprtzd2);
        spruib2.cfr_renamed_133.addElement(this.cfr_renamed_4455(string2));
        spruib2.cfr_renamed_145.addElement(arg2);
    }

    @Override
    public boolean equals(Object arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        spruib spruib2;
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof spruib) && !(arg0 instanceof sprbne)) {
            return false;
        }
        sprvva sprvva2 = ((spra)arg0).cfr_renamed_119();
        if (this.cfr_renamed_119().equals(sprvva2)) {
            return true;
        }
        try {
            spruib2 = spruib.cfr_renamed_23(arg0);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
        int n6 = this.cfr_renamed_134.size();
        if (n6 != spruib2.cfr_renamed_134.size()) {
            return false;
        }
        boolean[] blArray = new boolean[n6];
        if (this.cfr_renamed_134.elementAt(0).equals(spruib2.cfr_renamed_134.elementAt(0))) {
            n5 = 0;
            n4 = n6;
            n3 = 1;
            n2 = n5;
        } else {
            n5 = n6 - 1;
            n4 = -1;
            n3 = -1;
            n2 = n5;
        }
        int n7 = n = n2;
        while (n7 != n4) {
            boolean bl;
            block12: {
                int n8;
                boolean bl2 = false;
                sprtzd sprtzd2 = (sprtzd)this.cfr_renamed_134.elementAt(n);
                String string = (String)this.cfr_renamed_133.elementAt(n);
                int n9 = n8 = 0;
                while (n9 < n6) {
                    String string2;
                    sprtzd sprtzd3;
                    if (!blArray[n8] && sprtzd2.equals(sprtzd3 = (sprtzd)spruib2.cfr_renamed_134.elementAt(n8)) && this.cfr_renamed_4453(string, string2 = (String)spruib2.cfr_renamed_133.elementAt(n8))) {
                        blArray[n8] = true;
                        bl = bl2 = true;
                        break block12;
                    }
                    n9 = ++n8;
                }
                bl = bl2;
            }
            if (!bl) {
                return false;
            }
            n7 = n + n3;
        }
        return true;
    }

    private /* synthetic */ String cfr_renamed_4457(String arg0) {
        StringBuffer stringBuffer = new StringBuffer();
        if (arg0.length() != 0) {
            char c = arg0.charAt(0);
            stringBuffer.append(c);
            int n = 1;
            int n2 = n;
            while (n2 < arg0.length()) {
                char c2 = arg0.charAt(n);
                if (c != ' ' || c2 != ' ') {
                    stringBuffer.append(c2);
                }
                c = c2;
                n2 = ++n;
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_119 == null) {
            int n;
            sprlre sprlre2 = new sprlre();
            sprlre sprlre3 = new sprlre();
            sprtzd sprtzd2 = null;
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_134.size()) {
                sprtzd sprtzd3;
                sprlre sprlre4 = new sprlre();
                sprtzd sprtzd4 = (sprtzd)this.cfr_renamed_134.elementAt(n);
                sprlre4.cfr_renamed_49(sprtzd4);
                String string = (String)this.cfr_renamed_133.elementAt(n);
                sprlre4.cfr_renamed_49(this.cfr_renamed_314.cfr_renamed_4447(sprtzd4, string));
                if (sprtzd2 == null || ((Boolean)this.cfr_renamed_145.elementAt(n)).booleanValue()) {
                    sprlre3.cfr_renamed_49(new sprpse(sprlre4));
                    sprtzd3 = sprtzd4;
                } else {
                    sprlre2.cfr_renamed_49(new sprcwe(sprlre3));
                    sprlre3 = new sprlre();
                    sprtzd3 = sprtzd4;
                    sprlre3.cfr_renamed_49(new sprpse(sprlre4));
                }
                sprtzd2 = sprtzd3;
                n2 = ++n;
            }
            sprlre2.cfr_renamed_49(new sprcwe(sprlre3));
            this.cfr_renamed_119 = new sprpse(sprlre2);
        }
        return this.cfr_renamed_119;
    }

    public Vector cfr_renamed_4461() {
        int n;
        Vector vector = new Vector();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_134.size()) {
            vector.addElement(this.cfr_renamed_134.elementAt(n++));
            n2 = n;
        }
        return vector;
    }

    private /* synthetic */ sprtzd cfr_renamed_4460(String arg0, Hashtable arg1) {
        if (sprywa.cfr_renamed_116(arg0 = arg0.trim()).startsWith(sprinq.cfr_renamed_9("S\u0007X`"))) {
            return new sprtzd(arg0.substring(4));
        }
        if (arg0.charAt(0) >= '0' && arg0.charAt(0) <= '9') {
            return new sprtzd(arg0);
        }
        sprtzd sprtzd2 = (sprtzd)arg1.get(sprywa.cfr_renamed_425(arg0));
        if (sprtzd2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsey.cfr_renamed_9("{&E&A?@hA*D-M<\u000e!Jh\u0003h")).append(arg0).append(sprinq.cfr_renamed_9("n1nl/o=y*<:snx'o:u {;u=t+xnr/q+")).toString());
        }
        return sprtzd2;
    }

    /*
     * WARNING - void declaration
     */
    public spruib(boolean bl, Hashtable hashtable, String string, sprqje sprqje2) {
        void arg0;
        Object object;
        Object object2;
        void arg2;
        spruib spruib2 = this;
        this.cfr_renamed_314 = null;
        spruib spruib3 = this;
        this.cfr_renamed_134 = new Vector();
        spruib2.cfr_renamed_133 = new Vector();
        spruib2.cfr_renamed_145 = new Vector();
        spruib2.cfr_renamed_314 = sprqje2;
        sproke sproke2 = new sproke((String)arg2);
        while (sproke2.cfr_renamed_4444()) {
            void arg1;
            object2 = sproke2.cfr_renamed_4445();
            if (((String)object2).indexOf(43) > 0) {
                Object object3 = object = new sproke((String)object2, '+');
                Object object4 = object3;
                this.cfr_renamed_4459((Hashtable)arg1, ((sproke)object3).cfr_renamed_4445(), cfr_renamed_135);
                while (((sproke)object4).cfr_renamed_4444()) {
                    Object object5 = object;
                    object4 = object5;
                    this.cfr_renamed_4459((Hashtable)arg1, ((sproke)object5).cfr_renamed_4445(), cfr_renamed_728);
                }
                continue;
            }
            this.cfr_renamed_4459((Hashtable)arg1, (String)object2, cfr_renamed_135);
        }
        if (arg0 != false) {
            int n;
            object2 = new Vector();
            object = new Vector();
            Vector vector = new Vector();
            int n2 = 1;
            int n3 = n = 0;
            while (n3 < this.cfr_renamed_134.size()) {
                Object object6 = object2;
                if (((Boolean)this.cfr_renamed_145.elementAt(n)).booleanValue()) {
                    ((Vector)object6).insertElementAt(this.cfr_renamed_134.elementAt(n), n2);
                    spruib spruib4 = this;
                    ((Vector)object).insertElementAt(spruib4.cfr_renamed_133.elementAt(n), n2);
                    vector.insertElementAt(spruib4.cfr_renamed_145.elementAt(n), n2++);
                } else {
                    ((Vector)object6).insertElementAt(this.cfr_renamed_134.elementAt(n), 0);
                    spruib spruib5 = this;
                    ((Vector)object).insertElementAt(spruib5.cfr_renamed_133.elementAt(n), 0);
                    vector.insertElementAt(spruib5.cfr_renamed_145.elementAt(n), 0);
                    n2 = 1;
                }
                n3 = ++n;
            }
            spruib spruib6 = this;
            spruib6.cfr_renamed_134 = object2;
            spruib6.cfr_renamed_133 = object;
            this.cfr_renamed_145 = vector;
        }
    }
}

