using System;
using System.Collections.Generic;
using System.ComponentModel.Design.Serialization;
using System.Linq;
using System.Runtime.CompilerServices;

public class Program
{
    public static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        for (int i = 0; i < n; i++)
        {
            int m = Convert.ToInt32(Console.ReadLine());
            int[] graf = ReadArray(Console.ReadLine());
            
            Node root = new Node();
            foreach (var g in graf)
            {
                Console.WriteLine(g.ToString());
                Console.WriteLine("Novi kod");
            }
        }
    }
    public static int[] ReadArray(string s)
    {
        var s2 = s.Split(' ');
        int[] res = new int[s2.Length];
        for (int i = 0; i < res.Length; i++)
        {
            res[i] = Convert.ToInt32(s2[i]);
        }
        return res;
    }
    public class Node
    {
        public int num;
        public List<Node> kids = new List<Node>();
        public Node this[int i]
        {
            get { return kids.Find(x => x.num == i); }
            set {  }
        }
    }
}
