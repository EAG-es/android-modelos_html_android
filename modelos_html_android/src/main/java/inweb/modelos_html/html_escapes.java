package inweb.modelos_html;

import java.util.HashMap;
import java.util.Map;

import innui.bases;
import innui.modelos.errores.oks;

/**
 * @author emilio
 */
public class html_escapes extends bases {
    public static Map<String, Character> escapes_mapa = new HashMap<>() {
        {
            put("&Tab;", '\t');
            put("&NewLine;", '\n');
            put("&nbsp;", ' ');
            put("&quot;", '"');
            put("&amp;", '&');
            put("&lt;", '<');
            put("&gt;", '>');
            put("&nbsp;", ' ');
            put("&iexcl;", '¡');
            put("&cent;", '¢');
            put("&pound;", '£');
            put("&curren;", '¤');
            put("&yen;", '¥');
            put("&brvbar;", '¦');
            put("&sect;", '§');
            put("&uml;", '¨');
            put("&copy;", '©');
            put("&ordf;", 'ª');
            put("&laquo;", '«');
            put("&not;", '¬');
            put("&shy;", '­');
            put("&reg;", '®');
            put("&macr;", '¯');
            put("&deg;", '°');
            put("&plusmn;", '±');
            put("&sup2;", '²');
            put("&sup3;", '³');
            put("&acute;", '´');
            put("&micro;", 'µ');
            put("&para;", '¶');
            put("&dot;", '·');
            put("&cedil;", '¸');
            put("&sup1;", '¹');
            put("&ordm;", 'º');
            put("&raquo;", '»');
            put("&frac14;", '¼');
            put("&frac12;", '½');
            put("&frac34;", '¾');
            put("&iquest;", '¿');
            put("&Agrave;", 'À');
            put("&Aacute;", 'Á');
            put("&Acirc;", ' ');
            put("&Atilde;", 'Ã');
            put("&Auml;", 'Ä');
            put("&Aring;", 'Å');
            put("&AElig;", 'Æ');
            put("&Ccedil;", 'Ç');
            put("&Egrave;", 'È');
            put("&Eacute;", 'É');
            put("&Ecirc;", 'Ê');
            put("&Euml;", 'Ë');
            put("&Igrave;", 'Ì');
            put("&Iacute;", 'Í');
            put("&Icirc;", 'Î');
            put("&Iuml;", 'Ï');
            put("&ETH;", 'Ð');
            put("&Ntilde;", 'Ñ');
            put("&Ograve;", 'Ò');
            put("&Oacute;", 'Ó');
            put("&Ocirc;", 'Ô');
            put("&Otilde;", 'Õ');
            put("&Ouml;", 'Ö');
            put("&times;", '×');
            put("&Oslash;", 'Ø');
            put("&Ugrave;", 'Ù');
            put("&Uacute;", 'Ú');
            put("&Ucirc;", 'Û');
            put("&Uuml;", 'Ü');
            put("&Yacute;", 'Ý');
            put("&THORN;", 'Þ');
            put("&szlig;", 'ß');
            put("&agrave;", 'à');
            put("&aacute;", 'á');
            put("&acirc;", 'â');
            put("&atilde;", 'ã');
            put("&auml;", 'ä');
            put("&aring;", 'å');
            put("&aelig;", 'æ');
            put("&ccedil;", 'ç');
            put("&egrave;", 'è');
            put("&eacute;", 'é');
            put("&ecirc;", 'ê');
            put("&euml;", 'ë');
            put("&igrave;", 'ì');
            put("&iacute;", 'í');
            put("&icirc;", 'î');
            put("&iuml;", 'ï');
            put("&eth;", 'ð');
            put("&ntilde;", 'ñ');
            put("&ograve;", 'ò');
            put("&oacute;", 'ó');
            put("&ocirc;", 'ô');
            put("&otilde;", 'õ');
            put("&ouml;", 'ö');
            put("&divide;", '÷');
            put("&oslash;", 'ø');
            put("&ugrave;", 'ù');
            put("&uacute;", 'ú');
            put("&ucirc;", 'û');
            put("&uuml;", 'ü');
            put("&yacute;", 'ý');
            put("&thorn;", 'þ');
            put("&yuml;", 'ÿ');
            put("&Amacr;", 'Ā');
            put("&amacr;", 'ā');
            put("&Abreve;", 'Ă');
            put("&abreve;", 'ă');
            put("&Aogon;", 'Ą');
            put("&aogon;", 'ą');
            put("&Cacute;", 'Ć');
            put("&cacute;", 'ć');
            put("&Ccirc;", 'Ĉ');
            put("&ccirc;", 'ĉ');
            put("&Cdot;", 'Ċ');
            put("&cdot;", 'ċ');
            put("&Ccaron;", 'Č');
            put("&ccaron;", 'č');
            put("&Dcaron;", 'Ď');
            put("&dcaron;", 'ď');
            put("&Dstrok;", 'Đ');
            put("&dstrok;", 'đ');
            put("&Emacr;", 'Ē');
            put("&emacr;", 'ē');
            put("&Ebreve;", 'Ĕ');
            put("&ebreve;", 'ĕ');
            put("&Edot;", 'Ė');
            put("&edot;", 'ė');
            put("&Eogon;", 'Ę');
            put("&eogon;", 'ę');
            put("&Ecaron;", 'Ě');
            put("&ecaron;", 'ě');
            put("&Gcirc;", 'Ĝ');
            put("&gcirc;", 'ĝ');
            put("&Gbreve;", 'Ğ');
            put("&gbreve;", 'ğ');
            put("&Gdot;", 'Ġ');
            put("&gdot;", 'ġ');
            put("&Gcedil;", 'Ģ');
            put("&gcedil;", 'ģ');
            put("&Hcirc;", 'Ĥ');
            put("&hcirc;", 'ĥ');
            put("&Hstrok;", 'Ħ');
            put("&hstrok;", 'ħ');
            put("&Itilde;", 'Ĩ');
            put("&itilde;", 'ĩ');
            put("&Imacr;", 'Ī');
            put("&imacr;", 'ī');
            put("&Ibreve;", 'Ĭ');
            put("&ibreve;", 'ĭ');
            put("&Iogon;", 'Į');
            put("&iogon;", 'į');
            put("&Idot;", 'İ');
            put("&inodot;", 'ı');
            put("&imath;", 'ı');
            put("&IJlig;", 'Ĳ');
            put("&ijlig;", 'ĳ');
            put("&Jcirc;", 'Ĵ');
            put("&jcirc;", 'ĵ');
            put("&Kcedil;", 'Ķ');
            put("&kcedil;", 'ķ');
            put("&kgreen;", 'ĸ');
            put("&Lacute;", 'Ĺ');
            put("&lacute;", 'ĺ');
            put("&Lcedil;", 'Ļ');
            put("&lcedil;", 'ļ');
            put("&Lcaron;", 'Ľ');
            put("&lcaron;", 'ľ');
            put("&Lmidot;", 'Ŀ');
            put("&lmidot;", 'ŀ');
            put("&Lstrok;", 'Ł');
            put("&lstrok;", 'ł');
            put("&Nacute;", 'Ń');
            put("&nacute;", 'ń');
            put("&Ncedil;", 'Ņ');
            put("&ncedil;", 'ņ');
            put("&Ncaron;", 'Ň');
            put("&ncaron;", 'ň');
            put("&napos;", 'ŉ');
            put("&ENG;", 'Ŋ');
            put("&eng;", 'ŋ');
            put("&Omacr;", 'Ō');
            put("&omacr;", 'ō');
            put("&Obreve;", 'Ŏ');
            put("&obreve;", 'ŏ');
            put("&Odblac;", 'Ő');
            put("&odblac;", 'ő');
            put("&OElig;", 'Œ');
            put("&oelig;", 'œ');
            put("&Racute;", 'Ŕ');
            put("&racute;", 'ŕ');
            put("&Rcedil;", 'Ŗ');
            put("&rcedil;", 'ŗ');
            put("&Rcaron;", 'Ř');
            put("&rcaron;", 'ř');
            put("&Sacute;", 'Ś');
            put("&sacute;", 'ś');
            put("&Scirc;", 'Ŝ');
            put("&scirc;", 'ŝ');
            put("&Scedil;", 'Ş');
            put("&scedil;", 'ş');
            put("&Scaron;", 'Š');
            put("&scaron;", 'š');
            put("&Tcedil;", 'Ţ');
            put("&tcedil;", 'ţ');
            put("&Tcaron;", 'Ť');
            put("&tcaron;", 'ť');
            put("&Tstrok;", 'Ŧ');
            put("&tstrok;", 'ŧ');
            put("&Utilde;", 'Ũ');
            put("&utilde;", 'ũ');
            put("&Umacr;", 'Ū');
            put("&umacr;", 'ū');
            put("&Ubreve;", 'Ŭ');
            put("&ubreve;", 'ŭ');
            put("&Uring;", 'Ů');
            put("&uring;", 'ů');
            put("&Udblac;", 'Ű');
            put("&udblac;", 'ű');
            put("&Uogon;", 'Ų');
            put("&uogon;", 'ų');
            put("&Wcirc;", 'Ŵ');
            put("&wcirc;", 'ŵ');
            put("&Ycirc;", 'Ŷ');
            put("&ycirc;", 'ŷ');
            put("&Yuml;", 'Ÿ');
            put("&fnof;", 'ƒ');
            put("&circ;", 'ˆ');
            put("&tilde;", '˜');
            put("&Alpha;", 'Α');
            put("&Beta;", 'Β');
            put("&Gamma;", 'Γ');
            put("&Delta;", 'Δ');
            put("&Epsilon;", 'Ε');
            put("&Zeta;", 'Ζ');
            put("&Eta;", 'Η');
            put("&Theta;", 'Θ');
            put("&Iota;", 'Ι');
            put("&Kappa;", 'Κ');
            put("&Lambda;", 'Λ');
            put("&Mu;", 'Μ');
            put("&Nu;", 'Ν');
            put("&Xi;", 'Ξ');
            put("&Omicron;", 'Ο');
            put("&Pi;", 'Π');
            put("&Rho;", 'Ρ');
            put("&Sigma;", 'Σ');
            put("&Tau;", 'Τ');
            put("&Upsilon;", 'Υ');
            put("&Phi;", 'Φ');
            put("&Chi;", 'Χ');
            put("&Psi;", 'Ψ');
            put("&Omega;", 'Ω');
            put("&alpha;", 'α');
            put("&beta;", 'β');
            put("&gamma;", 'γ');
            put("&delta;", 'δ');
            put("&epsilon;", 'ε');
            put("&zeta;", 'ζ');
            put("&eta;", 'η');
            put("&theta;", 'θ');
            put("&iota;", 'ι');
            put("&kappa;", 'κ');
            put("&lambda;", 'λ');
            put("&mu;", 'μ');
            put("&nu;", 'ν');
            put("&xi;", 'ξ');
            put("&omicron;", 'ο');
            put("&pi;", 'π');
            put("&rho;", 'ρ');
            put("&sigmaf;", 'ς');
            put("&sigma;", 'σ');
            put("&tau;", 'τ');
            put("&upsilon;", 'υ');
            put("&phi;", 'φ');
            put("&chi;", 'χ');
            put("&psi;", 'ψ');
            put("&omega;", 'ω');
            put("&thetasym;", 'ϑ');
            put("&upsih;", 'ϒ');
            put("&piv;", 'ϖ');
            put("&ensp;", ' ');
            put("&emsp;", ' ');
            put("&thinsp;", ' ');
            put("&zwnj;", '‌');
            put("&zwj;", '‍');
            put("&lrm;", '‎');
            put("&rlm;", '‏');
            put("&ndash;", '–');
            put("&mdash;", '—');
            put("&lsquo;", '‘');
            put("&rsquo;", '’');
            put("&sbquo;", '‚');
            put("&ldquo;", '“');
            put("&rdquo;", '”');
            put("&bdquo;", '„');
            put("&dagger;", '†');
            put("&Dagger;", '‡');
            put("&bull;", '•');
            put("&hellip;", '…');
            put("&permil;", '‰');
            put("&prime;", '′');
            put("&Prime;", '″');
            put("&lsaquo;", '‹');
            put("&rsaquo;", '›');
            put("&oline;", '‾');
            put("&euro;", '€');
            put("&trade;", '™');
            put("&larr;", '←');
            put("&uarr;", '↑');
            put("&rarr;", '→');
            put("&darr;", '↓');
            put("&harr;", '↔');
            put("&crarr;", '↵');
            put("&forall;", '∀');
            put("&part;", '∂');
            put("&exist;", '∃');
            put("&empty;", '∅');
            put("&nabla;", '∇');
            put("&isin;", '∈');
            put("&notin;", '∉');
            put("&ni;", '∋');
            put("&prod;", '∏');
            put("&sum;", '∑');
            put("&minus;", '−');
            put("&lowast;", '∗');
            put("&radic;", '√');
            put("&prop;", '∝');
            put("&infin;", '∞');
            put("&ang;", '∠');
            put("&and;", '∧');
            put("&or;", '∨');
            put("&cap;", '∩');
            put("&cup;", '∪');
            put("&int;", '∫');
            put("&there4;", '∴');
            put("&sim;", '∼');
            put("&cong;", '≅');
            put("&asymp;", '≈');
            put("&ne;", '≠');
            put("&equiv;", '≡');
            put("&le;", '≤');
            put("&ge;", '≥');
            put("&sub;", '⊂');
            put("&sup;", '⊃');
            put("&nsub;", '⊄');
            put("&sube;", '⊆');
            put("&supe;", '⊇');
            put("&oplus;", '⊕');
            put("&otimes;", '⊗');
            put("&perp;", '⊥');
            put("&sdot;", '⋅');
            put("&lceil;", '⌈');
            put("&rceil;", '⌉');
            put("&lfloor;", '⌊');
            put("&rfloor;", '⌋');
            put("&loz;", '◊');
            put("&spades;", '♠');
            put("&clubs;", '♣');
            put("&hearts;", '♥');
            put("&diams;", '♦');
        }
    };

    /**
     * Convierte los caracteres a su equivalente formato de escape en HTML
     *
     * @param texto
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception
     */
    public static String poner_escape_HTML(String texto, oks ok, Object... extras_array) throws Exception {
        StringBuilder resultado_tex = new StringBuilder();
        try {
            char letra;
            for (int i = 0; i < texto.length(); i++) {
                letra = texto.charAt(i);
                switch (letra) {
                    case 9:
                        resultado_tex.append("&Tab;");
                        break;
                    case 10:
                        resultado_tex.append("&NewLine;");
                        break;
                    case 32:
                        resultado_tex.append("&nbsp;");
                        break;
                    case 34:
                        resultado_tex.append("&quot;");
                        break;
                    case 38:
                        resultado_tex.append("&amp;");
                        break;
                    case 60:
                        resultado_tex.append("&lt;");
                        break;
                    case 62:
                        resultado_tex.append("&gt;");
                        break;
                    case 160:
                        resultado_tex.append("&nbsp;");
                        break;
                    case 161:
                        resultado_tex.append("&iexcl;");
                        break;
                    case 162:
                        resultado_tex.append("&cent;");
                        break;
                    case 163:
                        resultado_tex.append("&pound;");
                        break;
                    case 164:
                        resultado_tex.append("&curren;");
                        break;
                    case 165:
                        resultado_tex.append("&yen;");
                        break;
                    case 166:
                        resultado_tex.append("&brvbar;");
                        break;
                    case 167:
                        resultado_tex.append("&sect;");
                        break;
                    case 168:
                        resultado_tex.append("&uml;");
                        break;
                    case 169:
                        resultado_tex.append("&copy;");
                        break;
                    case 170:
                        resultado_tex.append("&ordf;");
                        break;
                    case 171:
                        resultado_tex.append("&laquo;");
                        break;
                    case 172:
                        resultado_tex.append("&not;");
                        break;
                    case 173:
                        resultado_tex.append("&shy;");
                        break;
                    case 174:
                        resultado_tex.append("&reg;");
                        break;
                    case 175:
                        resultado_tex.append("&macr;");
                        break;
                    case 176:
                        resultado_tex.append("&deg;");
                        break;
                    case 177:
                        resultado_tex.append("&plusmn;");
                        break;
                    case 178:
                        resultado_tex.append("&sup2;");
                        break;
                    case 179:
                        resultado_tex.append("&sup3;");
                        break;
                    case 180:
                        resultado_tex.append("&acute;");
                        break;
                    case 181:
                        resultado_tex.append("&micro;");
                        break;
                    case 182:
                        resultado_tex.append("&para;");
                        break;
                    case 183:
                        resultado_tex.append("&dot;");
                        break;
                    case 184:
                        resultado_tex.append("&cedil;");
                        break;
                    case 185:
                        resultado_tex.append("&sup1;");
                        break;
                    case 186:
                        resultado_tex.append("&ordm;");
                        break;
                    case 187:
                        resultado_tex.append("&raquo;");
                        break;
                    case 188:
                        resultado_tex.append("&frac14;");
                        break;
                    case 189:
                        resultado_tex.append("&frac12;");
                        break;
                    case 190:
                        resultado_tex.append("&frac34;");
                        break;
                    case 191:
                        resultado_tex.append("&iquest;");
                        break;
                    case 192:
                        resultado_tex.append("&Agrave;");
                        break;
                    case 193:
                        resultado_tex.append("&Aacute;");
                        break;
                    case 194:
                        resultado_tex.append("&Acirc;");
                        break;
                    case 195:
                        resultado_tex.append("&Atilde;");
                        break;
                    case 196:
                        resultado_tex.append("&Auml;");
                        break;
                    case 197:
                        resultado_tex.append("&Aring;");
                        break;
                    case 198:
                        resultado_tex.append("&AElig;");
                        break;
                    case 199:
                        resultado_tex.append("&Ccedil;");
                        break;
                    case 200:
                        resultado_tex.append("&Egrave;");
                        break;
                    case 201:
                        resultado_tex.append("&Eacute;");
                        break;
                    case 202:
                        resultado_tex.append("&Ecirc;");
                        break;
                    case 203:
                        resultado_tex.append("&Euml;");
                        break;
                    case 204:
                        resultado_tex.append("&Igrave;");
                        break;
                    case 205:
                        resultado_tex.append("&Iacute;");
                        break;
                    case 206:
                        resultado_tex.append("&Icirc;");
                        break;
                    case 207:
                        resultado_tex.append("&Iuml;");
                        break;
                    case 208:
                        resultado_tex.append("&ETH;");
                        break;
                    case 209:
                        resultado_tex.append("&Ntilde;");
                        break;
                    case 210:
                        resultado_tex.append("&Ograve;");
                        break;
                    case 211:
                        resultado_tex.append("&Oacute;");
                        break;
                    case 212:
                        resultado_tex.append("&Ocirc;");
                        break;
                    case 213:
                        resultado_tex.append("&Otilde;");
                        break;
                    case 214:
                        resultado_tex.append("&Ouml;");
                        break;
                    case 215:
                        resultado_tex.append("&times;");
                        break;
                    case 216:
                        resultado_tex.append("&Oslash;");
                        break;
                    case 217:
                        resultado_tex.append("&Ugrave;");
                        break;
                    case 218:
                        resultado_tex.append("&Uacute;");
                        break;
                    case 219:
                        resultado_tex.append("&Ucirc;");
                        break;
                    case 220:
                        resultado_tex.append("&Uuml;");
                        break;
                    case 221:
                        resultado_tex.append("&Yacute;");
                        break;
                    case 222:
                        resultado_tex.append("&THORN;");
                        break;
                    case 223:
                        resultado_tex.append("&szlig;");
                        break;
                    case 224:
                        resultado_tex.append("&agrave;");
                        break;
                    case 225:
                        resultado_tex.append("&aacute;");
                        break;
                    case 226:
                        resultado_tex.append("&acirc;");
                        break;
                    case 227:
                        resultado_tex.append("&atilde;");
                        break;
                    case 228:
                        resultado_tex.append("&auml;");
                        break;
                    case 229:
                        resultado_tex.append("&aring;");
                        break;
                    case 230:
                        resultado_tex.append("&aelig;");
                        break;
                    case 231:
                        resultado_tex.append("&ccedil;");
                        break;
                    case 232:
                        resultado_tex.append("&egrave;");
                        break;
                    case 233:
                        resultado_tex.append("&eacute;");
                        break;
                    case 234:
                        resultado_tex.append("&ecirc;");
                        break;
                    case 235:
                        resultado_tex.append("&euml;");
                        break;
                    case 236:
                        resultado_tex.append("&igrave;");
                        break;
                    case 237:
                        resultado_tex.append("&iacute;");
                        break;
                    case 238:
                        resultado_tex.append("&icirc;");
                        break;
                    case 239:
                        resultado_tex.append("&iuml;");
                        break;
                    case 240:
                        resultado_tex.append("&eth;");
                        break;
                    case 241:
                        resultado_tex.append("&ntilde;");
                        break;
                    case 242:
                        resultado_tex.append("&ograve;");
                        break;
                    case 243:
                        resultado_tex.append("&oacute;");
                        break;
                    case 244:
                        resultado_tex.append("&ocirc;");
                        break;
                    case 245:
                        resultado_tex.append("&otilde;");
                        break;
                    case 246:
                        resultado_tex.append("&ouml;");
                        break;
                    case 247:
                        resultado_tex.append("&divide;");
                        break;
                    case 248:
                        resultado_tex.append("&oslash;");
                        break;
                    case 249:
                        resultado_tex.append("&ugrave;");
                        break;
                    case 250:
                        resultado_tex.append("&uacute;");
                        break;
                    case 251:
                        resultado_tex.append("&ucirc;");
                        break;
                    case 252:
                        resultado_tex.append("&uuml;");
                        break;
                    case 253:
                        resultado_tex.append("&yacute;");
                        break;
                    case 254:
                        resultado_tex.append("&thorn;");
                        break;
                    case 255:
                        resultado_tex.append("&yuml;");
                        break;
                    case 256:
                        resultado_tex.append("&Amacr;");
                        break;
                    case 257:
                        resultado_tex.append("&amacr;");
                        break;
                    case 258:
                        resultado_tex.append("&Abreve;");
                        break;
                    case 259:
                        resultado_tex.append("&abreve;");
                        break;
                    case 260:
                        resultado_tex.append("&Aogon;");
                        break;
                    case 261:
                        resultado_tex.append("&aogon;");
                        break;
                    case 262:
                        resultado_tex.append("&Cacute;");
                        break;
                    case 263:
                        resultado_tex.append("&cacute;");
                        break;
                    case 264:
                        resultado_tex.append("&Ccirc;");
                        break;
                    case 265:
                        resultado_tex.append("&ccirc;");
                        break;
                    case 266:
                        resultado_tex.append("&Cdot;");
                        break;
                    case 267:
                        resultado_tex.append("&cdot;");
                        break;
                    case 268:
                        resultado_tex.append("&Ccaron;");
                        break;
                    case 269:
                        resultado_tex.append("&ccaron;");
                        break;
                    case 270:
                        resultado_tex.append("&Dcaron;");
                        break;
                    case 271:
                        resultado_tex.append("&dcaron;");
                        break;
                    case 272:
                        resultado_tex.append("&Dstrok;");
                        break;
                    case 273:
                        resultado_tex.append("&dstrok;");
                        break;
                    case 274:
                        resultado_tex.append("&Emacr;");
                        break;
                    case 275:
                        resultado_tex.append("&emacr;");
                        break;
                    case 276:
                        resultado_tex.append("&Ebreve;");
                        break;
                    case 277:
                        resultado_tex.append("&ebreve;");
                        break;
                    case 278:
                        resultado_tex.append("&Edot;");
                        break;
                    case 279:
                        resultado_tex.append("&edot;");
                        break;
                    case 280:
                        resultado_tex.append("&Eogon;");
                        break;
                    case 281:
                        resultado_tex.append("&eogon;");
                        break;
                    case 282:
                        resultado_tex.append("&Ecaron;");
                        break;
                    case 283:
                        resultado_tex.append("&ecaron;");
                        break;
                    case 284:
                        resultado_tex.append("&Gcirc;");
                        break;
                    case 285:
                        resultado_tex.append("&gcirc;");
                        break;
                    case 286:
                        resultado_tex.append("&Gbreve;");
                        break;
                    case 287:
                        resultado_tex.append("&gbreve;");
                        break;
                    case 288:
                        resultado_tex.append("&Gdot;");
                        break;
                    case 289:
                        resultado_tex.append("&gdot;");
                        break;
                    case 290:
                        resultado_tex.append("&Gcedil;");
                        break;
                    case 291:
                        resultado_tex.append("&gcedil;");
                        break;
                    case 292:
                        resultado_tex.append("&Hcirc;");
                        break;
                    case 293:
                        resultado_tex.append("&hcirc;");
                        break;
                    case 294:
                        resultado_tex.append("&Hstrok;");
                        break;
                    case 295:
                        resultado_tex.append("&hstrok;");
                        break;
                    case 296:
                        resultado_tex.append("&Itilde;");
                        break;
                    case 297:
                        resultado_tex.append("&itilde;");
                        break;
                    case 298:
                        resultado_tex.append("&Imacr;");
                        break;
                    case 299:
                        resultado_tex.append("&imacr;");
                        break;
                    case 300:
                        resultado_tex.append("&Ibreve;");
                        break;
                    case 301:
                        resultado_tex.append("&ibreve;");
                        break;
                    case 302:
                        resultado_tex.append("&Iogon;");
                        break;
                    case 303:
                        resultado_tex.append("&iogon;");
                        break;
                    case 304:
                        resultado_tex.append("&Idot;");
                        break;
                    case 305:
                        resultado_tex.append("&inodot;");
                        break;
                    case 306:
                        resultado_tex.append("&IJlig;");
                        break;
                    case 307:
                        resultado_tex.append("&ijlig;");
                        break;
                    case 308:
                        resultado_tex.append("&Jcirc;");
                        break;
                    case 309:
                        resultado_tex.append("&jcirc;");
                        break;
                    case 310:
                        resultado_tex.append("&Kcedil;");
                        break;
                    case 311:
                        resultado_tex.append("&kcedil;");
                        break;
                    case 312:
                        resultado_tex.append("&kgreen;");
                        break;
                    case 313:
                        resultado_tex.append("&Lacute;");
                        break;
                    case 314:
                        resultado_tex.append("&lacute;");
                        break;
                    case 315:
                        resultado_tex.append("&Lcedil;");
                        break;
                    case 316:
                        resultado_tex.append("&lcedil;");
                        break;
                    case 317:
                        resultado_tex.append("&Lcaron;");
                        break;
                    case 318:
                        resultado_tex.append("&lcaron;");
                        break;
                    case 319:
                        resultado_tex.append("&Lmidot;");
                        break;
                    case 320:
                        resultado_tex.append("&lmidot;");
                        break;
                    case 321:
                        resultado_tex.append("&Lstrok;");
                        break;
                    case 322:
                        resultado_tex.append("&lstrok;");
                        break;
                    case 323:
                        resultado_tex.append("&Nacute;");
                        break;
                    case 324:
                        resultado_tex.append("&nacute;");
                        break;
                    case 325:
                        resultado_tex.append("&Ncedil;");
                        break;
                    case 326:
                        resultado_tex.append("&ncedil;");
                        break;
                    case 327:
                        resultado_tex.append("&Ncaron;");
                        break;
                    case 328:
                        resultado_tex.append("&ncaron;");
                        break;
                    case 329:
                        resultado_tex.append("&napos;");
                        break;
                    case 330:
                        resultado_tex.append("&ENG;");
                        break;
                    case 331:
                        resultado_tex.append("&eng;");
                        break;
                    case 332:
                        resultado_tex.append("&Omacr;");
                        break;
                    case 333:
                        resultado_tex.append("&omacr;");
                        break;
                    case 334:
                        resultado_tex.append("&Obreve;");
                        break;
                    case 335:
                        resultado_tex.append("&obreve;");
                        break;
                    case 336:
                        resultado_tex.append("&Odblac;");
                        break;
                    case 337:
                        resultado_tex.append("&odblac;");
                        break;
                    case 338:
                        resultado_tex.append("&OElig;");
                        break;
                    case 339:
                        resultado_tex.append("&oelig;");
                        break;
                    case 340:
                        resultado_tex.append("&Racute;");
                        break;
                    case 341:
                        resultado_tex.append("&racute;");
                        break;
                    case 342:
                        resultado_tex.append("&Rcedil;");
                        break;
                    case 343:
                        resultado_tex.append("&rcedil;");
                        break;
                    case 344:
                        resultado_tex.append("&Rcaron;");
                        break;
                    case 345:
                        resultado_tex.append("&rcaron;");
                        break;
                    case 346:
                        resultado_tex.append("&Sacute;");
                        break;
                    case 347:
                        resultado_tex.append("&sacute;");
                        break;
                    case 348:
                        resultado_tex.append("&Scirc;");
                        break;
                    case 349:
                        resultado_tex.append("&scirc;");
                        break;
                    case 350:
                        resultado_tex.append("&Scedil;");
                        break;
                    case 351:
                        resultado_tex.append("&scedil;");
                        break;
                    case 352:
                        resultado_tex.append("&Scaron;");
                        break;
                    case 353:
                        resultado_tex.append("&scaron;");
                        break;
                    case 354:
                        resultado_tex.append("&Tcedil;");
                        break;
                    case 355:
                        resultado_tex.append("&tcedil;");
                        break;
                    case 356:
                        resultado_tex.append("&Tcaron;");
                        break;
                    case 357:
                        resultado_tex.append("&tcaron;");
                        break;
                    case 358:
                        resultado_tex.append("&Tstrok;");
                        break;
                    case 359:
                        resultado_tex.append("&tstrok;");
                        break;
                    case 360:
                        resultado_tex.append("&Utilde;");
                        break;
                    case 361:
                        resultado_tex.append("&utilde;");
                        break;
                    case 362:
                        resultado_tex.append("&Umacr;");
                        break;
                    case 363:
                        resultado_tex.append("&umacr;");
                        break;
                    case 364:
                        resultado_tex.append("&Ubreve;");
                        break;
                    case 365:
                        resultado_tex.append("&ubreve;");
                        break;
                    case 366:
                        resultado_tex.append("&Uring;");
                        break;
                    case 367:
                        resultado_tex.append("&uring;");
                        break;
                    case 368:
                        resultado_tex.append("&Udblac;");
                        break;
                    case 369:
                        resultado_tex.append("&udblac;");
                        break;
                    case 370:
                        resultado_tex.append("&Uogon;");
                        break;
                    case 371:
                        resultado_tex.append("&uogon;");
                        break;
                    case 372:
                        resultado_tex.append("&Wcirc;");
                        break;
                    case 373:
                        resultado_tex.append("&wcirc;");
                        break;
                    case 374:
                        resultado_tex.append("&Ycirc;");
                        break;
                    case 375:
                        resultado_tex.append("&ycirc;");
                        break;
                    case 376:
                        resultado_tex.append("&Yuml;");
                        break;
                    case 402:
                        resultado_tex.append("&fnof;");
                        break;
                    case 710:
                        resultado_tex.append("&circ;");
                        break;
                    case 732:
                        resultado_tex.append("&tilde;");
                        break;
                    case 913:
                        resultado_tex.append("&Alpha;");
                        break;
                    case 914:
                        resultado_tex.append("&Beta;");
                        break;
                    case 915:
                        resultado_tex.append("&Gamma;");
                        break;
                    case 916:
                        resultado_tex.append("&Delta;");
                        break;
                    case 917:
                        resultado_tex.append("&Epsilon;");
                        break;
                    case 918:
                        resultado_tex.append("&Zeta;");
                        break;
                    case 919:
                        resultado_tex.append("&Eta;");
                        break;
                    case 920:
                        resultado_tex.append("&Theta;");
                        break;
                    case 921:
                        resultado_tex.append("&Iota;");
                        break;
                    case 922:
                        resultado_tex.append("&Kappa;");
                        break;
                    case 923:
                        resultado_tex.append("&Lambda;");
                        break;
                    case 924:
                        resultado_tex.append("&Mu;");
                        break;
                    case 925:
                        resultado_tex.append("&Nu;");
                        break;
                    case 926:
                        resultado_tex.append("&Xi;");
                        break;
                    case 927:
                        resultado_tex.append("&Omicron;");
                        break;
                    case 928:
                        resultado_tex.append("&Pi;");
                        break;
                    case 929:
                        resultado_tex.append("&Rho;");
                        break;
                    case 931:
                        resultado_tex.append("&Sigma;");
                        break;
                    case 932:
                        resultado_tex.append("&Tau;");
                        break;
                    case 933:
                        resultado_tex.append("&Upsilon;");
                        break;
                    case 934:
                        resultado_tex.append("&Phi;");
                        break;
                    case 935:
                        resultado_tex.append("&Chi;");
                        break;
                    case 936:
                        resultado_tex.append("&Psi;");
                        break;
                    case 937:
                        resultado_tex.append("&Omega;");
                        break;
                    case 945:
                        resultado_tex.append("&alpha;");
                        break;
                    case 946:
                        resultado_tex.append("&beta;");
                        break;
                    case 947:
                        resultado_tex.append("&gamma;");
                        break;
                    case 948:
                        resultado_tex.append("&delta;");
                        break;
                    case 949:
                        resultado_tex.append("&epsilon;");
                        break;
                    case 950:
                        resultado_tex.append("&zeta;");
                        break;
                    case 951:
                        resultado_tex.append("&eta;");
                        break;
                    case 952:
                        resultado_tex.append("&theta;");
                        break;
                    case 953:
                        resultado_tex.append("&iota;");
                        break;
                    case 954:
                        resultado_tex.append("&kappa;");
                        break;
                    case 955:
                        resultado_tex.append("&lambda;");
                        break;
                    case 956:
                        resultado_tex.append("&mu;");
                        break;
                    case 957:
                        resultado_tex.append("&nu;");
                        break;
                    case 958:
                        resultado_tex.append("&xi;");
                        break;
                    case 959:
                        resultado_tex.append("&omicron;");
                        break;
                    case 960:
                        resultado_tex.append("&pi;");
                        break;
                    case 961:
                        resultado_tex.append("&rho;");
                        break;
                    case 962:
                        resultado_tex.append("&sigmaf;");
                        break;
                    case 963:
                        resultado_tex.append("&sigma;");
                        break;
                    case 964:
                        resultado_tex.append("&tau;");
                        break;
                    case 965:
                        resultado_tex.append("&upsilon;");
                        break;
                    case 966:
                        resultado_tex.append("&phi;");
                        break;
                    case 967:
                        resultado_tex.append("&chi;");
                        break;
                    case 968:
                        resultado_tex.append("&psi;");
                        break;
                    case 969:
                        resultado_tex.append("&omega;");
                        break;
                    case 977:
                        resultado_tex.append("&thetasym;");
                        break;
                    case 978:
                        resultado_tex.append("&upsih;");
                        break;
                    case 982:
                        resultado_tex.append("&piv;");
                        break;
                    case 8194:
                        resultado_tex.append("&ensp;");
                        break;
                    case 8195:
                        resultado_tex.append("&emsp;");
                        break;
                    case 8201:
                        resultado_tex.append("&thinsp;");
                        break;
                    case 8204:
                        resultado_tex.append("&zwnj;");
                        break;
                    case 8205:
                        resultado_tex.append("&zwj;");
                        break;
                    case 8206:
                        resultado_tex.append("&lrm;");
                        break;
                    case 8207:
                        resultado_tex.append("&rlm;");
                        break;
                    case 8211:
                        resultado_tex.append("&ndash;");
                        break;
                    case 8212:
                        resultado_tex.append("&mdash;");
                        break;
                    case 8216:
                        resultado_tex.append("&lsquo;");
                        break;
                    case 8217:
                        resultado_tex.append("&rsquo;");
                        break;
                    case 8218:
                        resultado_tex.append("&sbquo;");
                        break;
                    case 8220:
                        resultado_tex.append("&ldquo;");
                        break;
                    case 8221:
                        resultado_tex.append("&rdquo;");
                        break;
                    case 8222:
                        resultado_tex.append("&bdquo;");
                        break;
                    case 8224:
                        resultado_tex.append("&dagger;");
                        break;
                    case 8225:
                        resultado_tex.append("&Dagger;");
                        break;
                    case 8226:
                        resultado_tex.append("&bull;");
                        break;
                    case 8230:
                        resultado_tex.append("&hellip;");
                        break;
                    case 8240:
                        resultado_tex.append("&permil;");
                        break;
                    case 8242:
                        resultado_tex.append("&prime;");
                        break;
                    case 8243:
                        resultado_tex.append("&Prime;");
                        break;
                    case 8249:
                        resultado_tex.append("&lsaquo;");
                        break;
                    case 8250:
                        resultado_tex.append("&rsaquo;");
                        break;
                    case 8254:
                        resultado_tex.append("&oline;");
                        break;
                    case 8364:
                        resultado_tex.append("&euro;");
                        break;
                    case 8482:
                        resultado_tex.append("&trade;");
                        break;
                    case 8592:
                        resultado_tex.append("&larr;");
                        break;
                    case 8593:
                        resultado_tex.append("&uarr;");
                        break;
                    case 8594:
                        resultado_tex.append("&rarr;");
                        break;
                    case 8595:
                        resultado_tex.append("&darr;");
                        break;
                    case 8596:
                        resultado_tex.append("&harr;");
                        break;
                    case 8629:
                        resultado_tex.append("&crarr;");
                        break;
                    case 8704:
                        resultado_tex.append("&forall;");
                        break;
                    case 8706:
                        resultado_tex.append("&part;");
                        break;
                    case 8707:
                        resultado_tex.append("&exist;");
                        break;
                    case 8709:
                        resultado_tex.append("&empty;");
                        break;
                    case 8711:
                        resultado_tex.append("&nabla;");
                        break;
                    case 8712:
                        resultado_tex.append("&isin;");
                        break;
                    case 8713:
                        resultado_tex.append("&notin;");
                        break;
                    case 8715:
                        resultado_tex.append("&ni;");
                        break;
                    case 8719:
                        resultado_tex.append("&prod;");
                        break;
                    case 8721:
                        resultado_tex.append("&sum;");
                        break;
                    case 8722:
                        resultado_tex.append("&minus;");
                        break;
                    case 8727:
                        resultado_tex.append("&lowast;");
                        break;
                    case 8730:
                        resultado_tex.append("&radic;");
                        break;
                    case 8733:
                        resultado_tex.append("&prop;");
                        break;
                    case 8734:
                        resultado_tex.append("&infin;");
                        break;
                    case 8736:
                        resultado_tex.append("&ang;");
                        break;
                    case 8743:
                        resultado_tex.append("&and;");
                        break;
                    case 8744:
                        resultado_tex.append("&or;");
                        break;
                    case 8745:
                        resultado_tex.append("&cap;");
                        break;
                    case 8746:
                        resultado_tex.append("&cup;");
                        break;
                    case 8747:
                        resultado_tex.append("&int;");
                        break;
                    case 8756:
                        resultado_tex.append("&there4;");
                        break;
                    case 8764:
                        resultado_tex.append("&sim;");
                        break;
                    case 8773:
                        resultado_tex.append("&cong;");
                        break;
                    case 8776:
                        resultado_tex.append("&asymp;");
                        break;
                    case 8800:
                        resultado_tex.append("&ne;");
                        break;
                    case 8801:
                        resultado_tex.append("&equiv;");
                        break;
                    case 8804:
                        resultado_tex.append("&le;");
                        break;
                    case 8805:
                        resultado_tex.append("&ge;");
                        break;
                    case 8834:
                        resultado_tex.append("&sub;");
                        break;
                    case 8835:
                        resultado_tex.append("&sup;");
                        break;
                    case 8836:
                        resultado_tex.append("&nsub;");
                        break;
                    case 8838:
                        resultado_tex.append("&sube;");
                        break;
                    case 8839:
                        resultado_tex.append("&supe;");
                        break;
                    case 8853:
                        resultado_tex.append("&oplus;");
                        break;
                    case 8855:
                        resultado_tex.append("&otimes;");
                        break;
                    case 8869:
                        resultado_tex.append("&perp;");
                        break;
                    case 8901:
                        resultado_tex.append("&sdot;");
                        break;
                    case 8968:
                        resultado_tex.append("&lceil;");
                        break;
                    case 8969:
                        resultado_tex.append("&rceil;");
                        break;
                    case 8970:
                        resultado_tex.append("&lfloor;");
                        break;
                    case 8971:
                        resultado_tex.append("&rfloor;");
                        break;
                    case 9674:
                        resultado_tex.append("&loz;");
                        break;
                    case 9824:
                        resultado_tex.append("&spades;");
                        break;
                    case 9827:
                        resultado_tex.append("&clubs;");
                        break;
                    case 9829:
                        resultado_tex.append("&hearts;");
                        break;
                    case 9830:
                        resultado_tex.append("&diams;");
                    default:
                        resultado_tex.append(letra);
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return resultado_tex.toString();
    }

    public static String quitar_escape_HTML(String texto, oks ok, Object... extras_array) throws Exception {
        String resultado = "";
        int i = 0;
        int tam = texto.length();
        int inicio = -1;
        String nombre_escape = "";
        Character letra;
        while (true) {
            if (i >= tam) {
                break;
            }
            letra = texto.charAt(i);
            if (letra == '&') {
                inicio = i;
            }
            if (inicio >= 0) {
                nombre_escape = nombre_escape + texto.charAt(i);
                if (texto.charAt(i) == ';') {
                    letra = escapes_mapa.get(nombre_escape);
                    if (letra == null) {
                        resultado = resultado + texto.charAt(inicio);
                        i = inicio;
                    } else {
                        resultado = resultado + letra;
                    }
                    nombre_escape = "";
                    inicio = -1;
                } else if (inicio + 10 <= i) {
                    resultado = resultado + texto.charAt(inicio);
                    i = inicio;
                    nombre_escape = "";
                    inicio = -1;
                }
            } else {
                resultado = resultado + letra;
            }
            i = i + 1;
        }
        return resultado;
    }

}
