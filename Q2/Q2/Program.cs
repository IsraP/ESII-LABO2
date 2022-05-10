using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Q2
{
    abstract class LogWriter
    {
        public abstract ILog FactoryMethod();

        public void Log(int i)
        {
            var log = FactoryMethod();
            log.Write(i);


        }
    }

    class Archive : LogWriter
    {
        public override ILog FactoryMethod()
        {
            return new WriteArchive();
        }
    }
    class Aplication : LogWriter
    {
        public override ILog FactoryMethod()
        {
            return new WriteAplication();
        }
    }
    public interface ILog
    {
        void Write(int i);
    }
    class WriteArchive : ILog
    {
        public void Write(int i)
        {
            StreamWriter file = new StreamWriter("log.txt", append: true);
            file.WriteLine(i);
            file.Close();
        }
    }

    class WriteAplication : ILog
    {
        public void Write(int i)
        {
            Console.WriteLine(i);
        }
    }

    class Log
    {
        public void Main()
        {
            string s;
            Console.WriteLine("Digite 'Arquivo' ou 'Console':");
            do
            {
                s = Console.ReadLine();
                s = s.ToLower();
                if (s != "arquivo" && s != "console")
                {
                    Console.WriteLine("Opcao invalida!\n Tente novamente: ");
                }
            } while (s != "arquivo" && s != "console");

            if (s == "arquivo")
            {
                Contar(new Archive());
            }
            else
            {
                Contar(new Aplication());
            }
            Console.ReadLine();
        }
        public void Contar(LogWriter creator)
        {
            for (int i = 1; i <= 10; i++)
            {
                creator.Log(i);
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            new Log().Main();
        }
    }
}
