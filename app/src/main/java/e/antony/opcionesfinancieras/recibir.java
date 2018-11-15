public class recibir {
int Subyacente;
int Strike;
double Tasa;
int Madurez;
double volatilidad;
int Ramas;
recibir(int SUBYACENTE, int STRIKE,int MADUREZ,int RAMAS,double TASA,double VOLATILIDAD)
{
this.Subyacente= SUBYACENTE;
this.Strike=STRIKE;
this.Tasa= TASA;
this.Madurez=MADUREZ;
this.volatilidad=VOLATILIDAD;
this.Ramas= RAMAS;
}
double get_tasa()
{
    double tasa;
    tasa=(this.Tasa)/100;
    return tasa;
}
double get_volatilidad()
{
    double Volatilidad;
    Volatilidad=(this.volatilidad)/100;
    return Volatilidad;
}
double get_deltaT()
{
    double DELTAT;
    DELTAT=(Madurez/Ramas)/12;
    return DELTAT;
}
double get_U()
{
    double U;
    U=Math.exp(get_volatilidad()*Math.sqrt(get_deltaT()));
    return U;
}
double get_D()
{
    double D;
    D=Math.exp(get_volatilidad()*Math.sqrt(get_deltaT())*-1);
    return D;
}
double get_A()
{
    double A;
    A=Math.exp(get_tasa()*get_deltaT());
    return A;
}
double get_P()
{
    double P;
    P=(get_A()-get_D())/(get_U()-get_D());
    return P;
}
double get_uno_P()
{
    double unoP;
    unoP=1-get_P();
    return unoP;
}

}
