import { Component } from '@angular/core';

@Component({
  selector: 'app-pickin-teams',
  templateUrl: './pickin-teams.component.html',
  styleUrls: ['./pickin-teams.component.css']
})
export class PickinTeamsComponent {

  teamsPic: string = '../../assets/images/teams.jpg';

  images: any = [
    {
      src: '../../assets/images/baseball.jpg',
      alt: 'High-Fiving Baseball Team'
    },
    {
      src: '../../assets/images/football.jpg',
      alt: 'Jumping Football Team'
    }
  ]

  namePool: any = [
    'Brian',
    'Victoria',
    'Raymond',
    'Kirby',
    'Edwin',
    'Preston',
    'Rina',
    'Rob',
    'Donovan',
    'Aaliyah',
    'Chris',
    'NaDario',
    'Artyom',
    'Aung',
    'Jordan',
    'Dylan',
    'Brandon',
    'Jason',
    'Kelvin',
    'Lamar'
  ]

  teamA: any = [];
  teamOne: any = [];

  inNamePool: string = 'Name Pool';
  inTeamA: string = 'Team A';
  inTeamOne: string = 'Team One';

  changeTeam(index: number, location: string, destination: string): void {

    switch (location) {
      case 'Name Pool':
        if (destination === 'A')
          this.teamA.push(...this.namePool.splice(index, 1));
        else
          this.teamOne.push(...this.namePool.splice(index, 1));
        break;
      case 'Team A':
        if (destination === 'Pool')
          this.namePool.push(...this.teamA.splice(index, 1));
        else
          this.teamOne.push(...this.teamA.splice(index, 1));
        break;
      case 'Team One':
        if (destination === 'Pool')
          this.namePool.push(...this.teamOne.splice(index, 1));
        else
          this.teamA.push(...this.teamOne.splice(index, 1));
        break;
    }

  }

  currentImage: any = {
    src: '../../assets/images/baseball.jpg',
    alt: 'High-Fiving Baseball Team'
  }

  switchImages(): void {
    if (this.currentImage == this.images[0])
      this.currentImage = this.images[1];
    else
      this.currentImage = this.images[0];
  }

}
