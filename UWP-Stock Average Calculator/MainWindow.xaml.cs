using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace UWP-StockAverageCalc
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            // Start Window
            InitializeComponent();
        }

        private void OnClick(object sender, RoutedEventArgs e)
        {
            // Variables for button calculation
            float currentShares;
            float currentAverage;
            float newShares;
            float newAverage;
            float finalShares;
            float finalAverage;
            float currentCostBasis;
            float newCostBasis;

            // Collect user input
            currentShares = float.Parse(currentSharesBox.Text);
            currentAverage = float.Parse(currentAverageBox.Text);
            newShares = float.Parse(newSharesBox.Text);
            newAverage = float.Parse(newAverageBox.Text);

            // Calculate output
            currentCostBasis = (currentShares * currentAverage);
            newCostBasis = (newShares * newAverage);
            finalShares = (currentShares + newShares);
            finalAverage = ((currentCostBasis + newCostBasis) / finalShares);

            // Display Calculation
            finalSharesBox.Text = finalShares.ToString();
            finalAverageBox.Text = finalAverage.ToString();
        }
    }
}