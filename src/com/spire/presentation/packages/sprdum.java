/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprsvy;
import com.spire.presentation.packages.sprtrm;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

public class sprdum {
    private static sprtrm cfr_renamed_91;
    private static sprtrm cfr_renamed_0;
    private static sprtrm cfr_renamed_1;
    public static final Hashtable cfr_renamed_2;
    public static final Hashtable cfr_renamed_3;
    public static final Hashtable cfr_renamed_4;

    public static sprtrm cfr_renamed_7994(sprlem arg0) {
        return (sprtrm)cfr_renamed_4.get(arg0);
    }

    public static sprtrm cfr_renamed_1837(String arg0) {
        sprlem sprlem2 = (sprlem)cfr_renamed_2.get(arg0);
        if (sprlem2 != null) {
            return (sprtrm)cfr_renamed_4.get(sprlem2);
        }
        return null;
    }

    public static Enumeration cfr_renamed_289() {
        return cfr_renamed_2.keys();
    }

    public static sprlem cfr_renamed_2103(String arg0) {
        return (sprlem)cfr_renamed_2.get(arg0);
    }

    static {
        cfr_renamed_2 = new Hashtable();
        cfr_renamed_4 = new Hashtable();
        cfr_renamed_3 = new Hashtable();
        cfr_renamed_1 = new sprtrm(1024, new BigInteger(sprpon.cfr_renamed_9(";;=9888=2;213:8=;>>??0:>:=8>=>;><=>:?;?>2><<9<:138<<9<2881;>?9=;<<=9?9988?:02<:02=3>>;98219:9=2:>9;8293;?03030?88931209=;::??089??;=30<>8=8<>888:=3;==9=3:?>:>>089988><0??;=?8<13;8=;8:<=098;;>1288?;98;3?=1?:>?91>9;?3:?;:9;:81203<:9::<;8?:?2=8;8>?9289<9;99=9:=?8=:>8<:9?2<:9><>8:?8<2?3>;=;?219?2?=>21>;?:=189919")), new BigInteger(sprsvy.cfr_renamed_9("\nL\u000fB\u000fE\u0005B\r@\bM\tA\u000bD\fC\u0004@\b@\bE\nA\nE\rL\u000eC\u000eA\u000eL\u0005A\rD\u000eE\u000bD\u0004L\u0004C\nE\b@\u000eD\tA\fM\tD\tE\u000eL\u000bA\tD\u000fE\bD\u0004G\fF\u000f")), new BigInteger(sprpon.cfr_renamed_9(";9:03>39<>?<:<?::==>892828?<9<3;?;8=2?31>8:18<=;:<9=?>2>>18:?8?1=<?>=8>>30:<808>8>=>8=>8?;2<8?30802>3?>19:??<03?2;2=898>3>813?:<8>>>;>98=<>1:<39>1??:>;:>>>?2<88>83;2?29388<<8?981:;8;882<<==<90;0:0:;<<<8;?9?=1>>8>:8><:839<?=0>;393::82<>=<;;?903>992>8;88=:81202:::8:;0>93>9<?=::889=:93>8<219;81=?2<:0>?==:?<:3?8")));
        cfr_renamed_0 = new sprtrm(1024, new BigInteger(sprsvy.cfr_renamed_9("\rG\u0005@\t@\u0004C\rE\u0005M\rE\tL\u000eA\nD\r@\fM\nA\tE\fC\nM\fC\rG\rD\u000bD\bE\u000bD\u000bD\tM\u0005F\u0004D\u000fE\u000bM\u000bC\tL\fD\r@\t@\u000fC\tC\nA\u000fA\u000bC\u000eF\u0005L\bD\u0005@\rF\bG\nL\tF\u000eF\u0004L\u000eG\u0005L\u000fG\fG\u0005E\r@\nL\rB\bL\fC\nB\u0004L\u000eG\nM\u000eE\u000eF\fC\u000fC\u000fF\u000eB\u000bF\rB\fC\bD\u000b@\u000bC\u000bE\u000bD\fM\rE\rG\bA\tD\bG\u000eD\tG\u0004D\bB\bC\nM\bM\f@\nL\nE\u000eD\rE\u000fD\u0004C\u0004E\nF\bD\u000b@\fE\u0004@\u0004D\f@\u000bC\f@\u000bE\tC\u000fG\nB\nF\u0005F\nF\bM\bF\u000fA\u000bE\u000e@\u0004L\u000eG\u0005B\u0004A\bF\u000eF\rC\tG\nB\fE\bG\u000fM\r@\u0004A\nL\fL\bD\tF\fG\u000fB\u0004A\u0005@\tL\bM\bL\fG\rL\u000bG\bE\u000eL\u0004A\u0004D\bL\u0005A\u000eA\rB\u000f")), new BigInteger(sprpon.cfr_renamed_9("=021?8>8<?9=;93><13><;=8;13:?>??9;9>>>99=0?838<<:><:3>?199:==;<08:912>9<9:3<3")), new BigInteger(sprsvy.cfr_renamed_9("@\u000eM\bE\u0004F\nE\bL\nE\tL\f@\r@\u000fL\u000bG\b@\u000bC\u000fC\u0005A\tA\fF\u000fM\u000eB\u000bF\u000f@\tM\nL\nD\u000bE\bG\fB\nC\u0005L\rE\u000eM\u0005@\fL\u0005@\u000bE\u000eG\r@\u000eD\fF\u000bD\nD\u000fL\tF\rB\nM\u0005A\nG\u0004@\u0004C\rM\u0005A\u000bB\tC\u000eL\bL\r@\u0004M\u0004M\fM\u000bC\fC\tM\bB\u000eB\rG\bG\u000bB\nM\bA\nG\n@\u0004L\u000eC\u000fD\u000fC\fL\u000fL\u0005G\bC\u0005E\fL\fL\u000fA\u0005G\u000eB\bC\u0005C\nC\u000bL\nD\rM\rA\u000f@\u000f@\u000b@\bD\fM\nE\fG\bF\u000fE\u000fE\nB\u000bF\tC\u0004B\u0004B\u0005F\f@\u0004F\rM\bM\u000fF\u0004C\u0004B\u000fG\u000fB\fF\fG\u000fL\bC\u0005C\fM\u000eB\u0004@\u000f@\u000eF\bC\nF\rD\tA\u000bB\fF\u000fA\fE\nE\u000fF\nE\bC\u0004D\nA\u000eC\nE\fF\u0004A\fM\b@\t@\fG\u000fG\u0004B\tF\u000f@\r")));
        cfr_renamed_91 = new sprtrm(1024, new BigInteger(sprpon.cfr_renamed_9(";=89;8==;<3>??9=28;0<:<181<98;982920==9;=?;:2:3<8=9>91=?81=;?>9=>83;==?0909<;;=820=:<:;8<?:>2=<><9::<92=20>?<;9<<><;?>3<818>===83;;;8=;080:>;9>?;:>;:191:?9?90>92=?88?382;213=:9:<=8?;>?8<>=?;3<=?3:>09<<>?;=;20??2:;<>8=>?=>8=?989091>=?>;0;>?<:0<1>>;9=1>??0??<;?==0>;988;3:9:2=2:3;><;=9:3?;==;=><9<1;129<93>9=8:3")), new BigInteger(sprsvy.cfr_renamed_9("\u0005E\u000bC\rA\u000eM\u0004M\nA\t@\nD\tM\bA\tL\u0004E\bM\fE\u0004G\u0004F\u000bA\fF\rC\u000eM\nL\tL\u000fM\u000fA\u000eD\u000bF\bE\u000bF\u000b@\u000fG\u000eA\u000bF\t@\u000b@\u000fC\bM\u000bM\u0004D\r")), new BigInteger(sprpon.cfr_renamed_9(";:9<98289;=;=;:?=:>:91?0?830>19839:888=0>;9>?0<>2===2?203=2;9<3<309?3?>;?;2>9==88=<8?0:=::9;=>982;;=;99;29;;?;3;?:2>;0;==12<313098::98:<<>==>89?;0<:<=2999<==;;:=>2;<???202?2?>?2=<:8>=>;9;<:1:0>9;82;<92>=989;?;<9;>039>?2:9;3:;;3=3;:0;;=><;>8;:=1=1:::;8=9<?>>?<9<;2:3>;??09><=8?2:8?==8?3>2921:9<8<:;<81;?9==<21=")));
        cfr_renamed_4.put(sprqo.cfr_renamed_2, cfr_renamed_1);
        cfr_renamed_4.put(sprqo.cfr_renamed_152, cfr_renamed_0);
        cfr_renamed_4.put(sprqo.cfr_renamed_1, cfr_renamed_91);
        cfr_renamed_2.put(sprsvy.cfr_renamed_9("3S\u0007H&\u000f@\rD\u0011M\bY\u007f\u0006E\u0004H\u001bl\u0006SY}"), sprqo.cfr_renamed_2);
        cfr_renamed_2.put(sprpon.cfr_renamed_9("Nez~[9=;9'0>$I{sy~fZ{e$H"), sprqo.cfr_renamed_152);
        cfr_renamed_2.put(sprsvy.cfr_renamed_9("{\u001bO\u0000nG\bE\fY\u0005@\u00117N\rL\u0000S$N\u001b\u0011,_\u001c}"), sprqo.cfr_renamed_1);
    }
}

