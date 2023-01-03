import {Component, OnInit} from '@angular/core';
import Chart from 'chart.js/auto';
@Component({
  selector: 'app-grafico-barra',
  templateUrl: './grafico-barra.component.html',
  styleUrls: ['./grafico-barra.component.css']
})
export class GraficoBarraComponent {

  public Barchart: any;
  createBarChart(){
    this.Barchart = new Chart("MyBarChart", {
      type: 'bar',
      data: {
        labels: ["Guias Associadas", "Guias Não Associadas"],
        datasets: [{
          label: 'Quantidade',
          data: [1350, 200],
          backgroundColor: [
            'rgba(255, 99, 132, 0.8)',
            'rgba(94,151,182,0.8)'
          ],
          borderColor: [
            'rgba(255, 99, 132, 1)',
            'rgb(47,116,192,1)'
          ],
          borderWidth: 1
        },
        ]
      },
      options: {
        scales: {
          y: {
            beginAtZero: true
          }
        }
      }
    });
  }
  ngOnInit(): void {
    this.createBarChart();
  }

}
